package com.microsoft.graph.models;

public interface IStatefulResponseHandler<ResultType, DeserializedType> {
    /**
     * Generate result after receiving response
     *
     * @param request    the HTTP request
     * @param response the HTTP connection
     * @param serializer the serializer for parsing response
     * @param logger     the logger
     * @param <ResponseType> the native http client response type
     * @return           the result generated by this handler
     * @throws Exception an exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    @SuppressFBWarnings
    <ResponseType> ResultType generateResult(@Nonnull final IHttpRequest request,
                                             @Nonnull final ResponseType response,
                                             @Nonnull final ISerializer serializer,
                                             @Nonnull final ILogger logger) throws Exception;
}
