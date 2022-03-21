// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecLoggingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecLoggingGetArgs Empty = new VirtualNodeSpecLoggingGetArgs();

    /**
     * The access log configuration for a virtual node.
     * 
     */
    @Import(name="accessLog")
      private final @Nullable Output<VirtualNodeSpecLoggingAccessLogGetArgs> accessLog;

    public Output<VirtualNodeSpecLoggingAccessLogGetArgs> getAccessLog() {
        return this.accessLog == null ? Output.empty() : this.accessLog;
    }

    public VirtualNodeSpecLoggingGetArgs(@Nullable Output<VirtualNodeSpecLoggingAccessLogGetArgs> accessLog) {
        this.accessLog = accessLog;
    }

    private VirtualNodeSpecLoggingGetArgs() {
        this.accessLog = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecLoggingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecLoggingAccessLogGetArgs> accessLog;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecLoggingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLog = defaults.accessLog;
        }

        public Builder accessLog(@Nullable Output<VirtualNodeSpecLoggingAccessLogGetArgs> accessLog) {
            this.accessLog = accessLog;
            return this;
        }
        public Builder accessLog(@Nullable VirtualNodeSpecLoggingAccessLogGetArgs accessLog) {
            this.accessLog = Output.ofNullable(accessLog);
            return this;
        }        public VirtualNodeSpecLoggingGetArgs build() {
            return new VirtualNodeSpecLoggingGetArgs(accessLog);
        }
    }
}
