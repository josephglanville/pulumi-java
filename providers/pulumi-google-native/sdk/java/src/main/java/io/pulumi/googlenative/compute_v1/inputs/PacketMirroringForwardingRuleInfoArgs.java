// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringForwardingRuleInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringForwardingRuleInfoArgs Empty = new PacketMirroringForwardingRuleInfoArgs();

    /**
     * Resource URL to the forwarding rule representing the ILB configured as destination of the mirrored traffic.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    public PacketMirroringForwardingRuleInfoArgs(@Nullable Output<String> url) {
        this.url = url;
    }

    private PacketMirroringForwardingRuleInfoArgs() {
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringForwardingRuleInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringForwardingRuleInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Output.ofNullable(url);
            return this;
        }        public PacketMirroringForwardingRuleInfoArgs build() {
            return new PacketMirroringForwardingRuleInfoArgs(url);
        }
    }
}
