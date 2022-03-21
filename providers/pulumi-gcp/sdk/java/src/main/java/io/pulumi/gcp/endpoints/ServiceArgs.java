// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.endpoints;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * The full text of the Service Config YAML file (Example located here). If provided, must also provide
     * protoc_output_base64. open_api config must not be provided.
     * 
     */
    @Import(name="grpcConfig")
      private final @Nullable Output<String> grpcConfig;

    public Output<String> getGrpcConfig() {
        return this.grpcConfig == null ? Output.empty() : this.grpcConfig;
    }

    /**
     * The full text of the OpenAPI YAML configuration as described here. Either this, or both of grpc_config and
     * protoc_output_base64 must be specified.
     * 
     */
    @Import(name="openapiConfig")
      private final @Nullable Output<String> openapiConfig;

    public Output<String> getOpenapiConfig() {
        return this.openapiConfig == null ? Output.empty() : this.openapiConfig;
    }

    /**
     * The project ID that the service belongs to. If not provided, provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The full contents of the Service Descriptor File generated by protoc. This should be a compiled .pb file,
     * base64-encoded.
     * 
     */
    @Import(name="protocOutputBase64")
      private final @Nullable Output<String> protocOutputBase64;

    public Output<String> getProtocOutputBase64() {
        return this.protocOutputBase64 == null ? Output.empty() : this.protocOutputBase64;
    }

    /**
     * The name of the service. Usually of the form $apiname.endpoints.$projectid.cloud.goog.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    public ServiceArgs(
        @Nullable Output<String> grpcConfig,
        @Nullable Output<String> openapiConfig,
        @Nullable Output<String> project,
        @Nullable Output<String> protocOutputBase64,
        Output<String> serviceName) {
        this.grpcConfig = grpcConfig;
        this.openapiConfig = openapiConfig;
        this.project = project;
        this.protocOutputBase64 = protocOutputBase64;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ServiceArgs() {
        this.grpcConfig = Output.empty();
        this.openapiConfig = Output.empty();
        this.project = Output.empty();
        this.protocOutputBase64 = Output.empty();
        this.serviceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> grpcConfig;
        private @Nullable Output<String> openapiConfig;
        private @Nullable Output<String> project;
        private @Nullable Output<String> protocOutputBase64;
        private Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcConfig = defaults.grpcConfig;
    	      this.openapiConfig = defaults.openapiConfig;
    	      this.project = defaults.project;
    	      this.protocOutputBase64 = defaults.protocOutputBase64;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder grpcConfig(@Nullable Output<String> grpcConfig) {
            this.grpcConfig = grpcConfig;
            return this;
        }
        public Builder grpcConfig(@Nullable String grpcConfig) {
            this.grpcConfig = Output.ofNullable(grpcConfig);
            return this;
        }
        public Builder openapiConfig(@Nullable Output<String> openapiConfig) {
            this.openapiConfig = openapiConfig;
            return this;
        }
        public Builder openapiConfig(@Nullable String openapiConfig) {
            this.openapiConfig = Output.ofNullable(openapiConfig);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder protocOutputBase64(@Nullable Output<String> protocOutputBase64) {
            this.protocOutputBase64 = protocOutputBase64;
            return this;
        }
        public Builder protocOutputBase64(@Nullable String protocOutputBase64) {
            this.protocOutputBase64 = Output.ofNullable(protocOutputBase64);
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }        public ServiceArgs build() {
            return new ServiceArgs(grpcConfig, openapiConfig, project, protocOutputBase64, serviceName);
        }
    }
}
