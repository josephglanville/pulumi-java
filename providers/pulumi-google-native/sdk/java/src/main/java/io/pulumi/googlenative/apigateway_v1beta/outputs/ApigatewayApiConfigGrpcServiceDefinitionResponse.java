// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.apigateway_v1beta.outputs.ApigatewayApiConfigFileResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ApigatewayApiConfigGrpcServiceDefinitionResponse {
    /**
     * Input only. File descriptor set, generated by protoc. To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb. $ protoc --include_imports --include_source_info test.proto -o out.pb
     * 
     */
    private final ApigatewayApiConfigFileResponse fileDescriptorSet;
    /**
     * Optional. Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to 'protoc' command used to generate file_descriptor_set.
     * 
     */
    private final List<ApigatewayApiConfigFileResponse> source;

    @CustomType.Constructor
    private ApigatewayApiConfigGrpcServiceDefinitionResponse(
        @CustomType.Parameter("fileDescriptorSet") ApigatewayApiConfigFileResponse fileDescriptorSet,
        @CustomType.Parameter("source") List<ApigatewayApiConfigFileResponse> source) {
        this.fileDescriptorSet = fileDescriptorSet;
        this.source = source;
    }

    /**
     * Input only. File descriptor set, generated by protoc. To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb. $ protoc --include_imports --include_source_info test.proto -o out.pb
     * 
    */
    public ApigatewayApiConfigFileResponse getFileDescriptorSet() {
        return this.fileDescriptorSet;
    }
    /**
     * Optional. Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to 'protoc' command used to generate file_descriptor_set.
     * 
    */
    public List<ApigatewayApiConfigFileResponse> getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayApiConfigGrpcServiceDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApigatewayApiConfigFileResponse fileDescriptorSet;
        private List<ApigatewayApiConfigFileResponse> source;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayApiConfigGrpcServiceDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileDescriptorSet = defaults.fileDescriptorSet;
    	      this.source = defaults.source;
        }

        public Builder fileDescriptorSet(ApigatewayApiConfigFileResponse fileDescriptorSet) {
            this.fileDescriptorSet = Objects.requireNonNull(fileDescriptorSet);
            return this;
        }
        public Builder source(List<ApigatewayApiConfigFileResponse> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(ApigatewayApiConfigFileResponse... source) {
            return source(List.of(source));
        }        public ApigatewayApiConfigGrpcServiceDefinitionResponse build() {
            return new ApigatewayApiConfigGrpcServiceDefinitionResponse(fileDescriptorSet, source);
        }
    }
}
