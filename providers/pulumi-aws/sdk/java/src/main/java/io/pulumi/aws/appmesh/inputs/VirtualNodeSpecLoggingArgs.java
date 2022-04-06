// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecLoggingArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecLoggingArgs Empty = new VirtualNodeSpecLoggingArgs();

    /**
     * The access log configuration for a virtual node.
     * 
     */
    @Import(name="accessLog")
      private final @Nullable Output<VirtualNodeSpecLoggingAccessLogArgs> accessLog;

    public Output<VirtualNodeSpecLoggingAccessLogArgs> getAccessLog() {
        return this.accessLog == null ? Output.empty() : this.accessLog;
    }

    public VirtualNodeSpecLoggingArgs(@Nullable Output<VirtualNodeSpecLoggingAccessLogArgs> accessLog) {
        this.accessLog = accessLog;
    }

    private VirtualNodeSpecLoggingArgs() {
        this.accessLog = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecLoggingAccessLogArgs> accessLog;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecLoggingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLog = defaults.accessLog;
        }

        public Builder accessLog(@Nullable Output<VirtualNodeSpecLoggingAccessLogArgs> accessLog) {
            this.accessLog = accessLog;
            return this;
        }
        public Builder accessLog(@Nullable VirtualNodeSpecLoggingAccessLogArgs accessLog) {
            this.accessLog = Output.ofNullable(accessLog);
            return this;
        }        public VirtualNodeSpecLoggingArgs build() {
            return new VirtualNodeSpecLoggingArgs(accessLog);
        }
    }
}