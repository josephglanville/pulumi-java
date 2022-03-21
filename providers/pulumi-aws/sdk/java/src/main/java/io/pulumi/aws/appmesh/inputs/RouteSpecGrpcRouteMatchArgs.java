// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecGrpcRouteMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteMatchArgs Empty = new RouteSpecGrpcRouteMatchArgs();

    /**
     * The data to match from the gRPC request.
     * 
     */
    @Import(name="metadatas")
      private final @Nullable Output<List<RouteSpecGrpcRouteMatchMetadataArgs>> metadatas;

    public Output<List<RouteSpecGrpcRouteMatchMetadataArgs>> getMetadatas() {
        return this.metadatas == null ? Output.empty() : this.metadatas;
    }

    /**
     * The method name to match from the request. If you specify a name, you must also specify a `service_name`.
     * 
     */
    @Import(name="methodName")
      private final @Nullable Output<String> methodName;

    public Output<String> getMethodName() {
        return this.methodName == null ? Output.empty() : this.methodName;
    }

    /**
     * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * The fully qualified domain name for the service to match from the request.
     * 
     */
    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName == null ? Output.empty() : this.serviceName;
    }

    public RouteSpecGrpcRouteMatchArgs(
        @Nullable Output<List<RouteSpecGrpcRouteMatchMetadataArgs>> metadatas,
        @Nullable Output<String> methodName,
        @Nullable Output<String> prefix,
        @Nullable Output<String> serviceName) {
        this.metadatas = metadatas;
        this.methodName = methodName;
        this.prefix = prefix;
        this.serviceName = serviceName;
    }

    private RouteSpecGrpcRouteMatchArgs() {
        this.metadatas = Output.empty();
        this.methodName = Output.empty();
        this.prefix = Output.empty();
        this.serviceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RouteSpecGrpcRouteMatchMetadataArgs>> metadatas;
        private @Nullable Output<String> methodName;
        private @Nullable Output<String> prefix;
        private @Nullable Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadatas = defaults.metadatas;
    	      this.methodName = defaults.methodName;
    	      this.prefix = defaults.prefix;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder metadatas(@Nullable Output<List<RouteSpecGrpcRouteMatchMetadataArgs>> metadatas) {
            this.metadatas = metadatas;
            return this;
        }
        public Builder metadatas(@Nullable List<RouteSpecGrpcRouteMatchMetadataArgs> metadatas) {
            this.metadatas = Output.ofNullable(metadatas);
            return this;
        }
        public Builder metadatas(RouteSpecGrpcRouteMatchMetadataArgs... metadatas) {
            return metadatas(List.of(metadatas));
        }
        public Builder methodName(@Nullable Output<String> methodName) {
            this.methodName = methodName;
            return this;
        }
        public Builder methodName(@Nullable String methodName) {
            this.methodName = Output.ofNullable(methodName);
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Output.ofNullable(serviceName);
            return this;
        }        public RouteSpecGrpcRouteMatchArgs build() {
            return new RouteSpecGrpcRouteMatchArgs(metadatas, methodName, prefix, serviceName);
        }
    }
}
