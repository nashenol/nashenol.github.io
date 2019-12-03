if (window.location.host.includes('localhost')) {
    window.location.pathname = "/web/snake";
} else if (window.location.host.includes('github')) {
    window.location.pathname = "/workspace/web/snake";
}
