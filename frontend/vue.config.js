module.exports = {
    devServer: {
        port: 8080,
        proxy: {
            '/': {
                target: 'http://localhost:8081',
                ws: true,
                changeOrigin: true,
                logLevel: "debug",
            },
        }
    },
}