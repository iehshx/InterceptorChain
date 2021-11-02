interface Call {
    var request: Request
    fun getResponseWithInterceptorChain():Response
}