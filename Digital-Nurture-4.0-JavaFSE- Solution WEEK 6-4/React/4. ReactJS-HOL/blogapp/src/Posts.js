import React from 'react';
import Post from './Post';

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false
        };
    }

    loadPosts = () => {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => this.setState({ posts: data }))
            .catch(error => {
                console.error('Error fetching posts:', error);
                this.setState({ hasError: true });
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        console.error('Error caught by componentDidCatch:', error, info);
        this.setState({ hasError: true });
        alert('An error occurred. Please check the console for details.');
    }

    render() {
        if (this.state.hasError) {
            return <h1>Something went wrong while loading posts.</h1>;
        }

        return (
            <div className="posts-container">
                <h1>Blog Posts</h1>
                {this.state.posts.map(post => (
                    <Post key={post.id} post={post} />
                ))}
            </div>
        );
    }
}

export default Posts;