// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VirtualGatewaySpecLoggingAccessLogFileGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecLoggingAccessLogFileGetArgs Empty = new VirtualGatewaySpecLoggingAccessLogFileGetArgs();

    /**
     * The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="path", required=true)
      private final Output<String> path;

    public Output<String> getPath() {
        return this.path;
    }

    public VirtualGatewaySpecLoggingAccessLogFileGetArgs(Output<String> path) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private VirtualGatewaySpecLoggingAccessLogFileGetArgs() {
        this.path = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecLoggingAccessLogFileGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecLoggingAccessLogFileGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }
        public VirtualGatewaySpecLoggingAccessLogFileGetArgs build() {
            return new VirtualGatewaySpecLoggingAccessLogFileGetArgs(path);
        }
    }
}
