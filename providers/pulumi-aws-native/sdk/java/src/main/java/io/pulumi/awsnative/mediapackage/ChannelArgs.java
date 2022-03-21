// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage;

import io.pulumi.awsnative.mediapackage.inputs.ChannelLogConfigurationArgs;
import io.pulumi.awsnative.mediapackage.inputs.ChannelTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelArgs Empty = new ChannelArgs();

    /**
     * A short text description of the Channel.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The configuration parameters for egress access logging.
     * 
     */
    @Import(name="egressAccessLogs")
      private final @Nullable Output<ChannelLogConfigurationArgs> egressAccessLogs;

    public Output<ChannelLogConfigurationArgs> getEgressAccessLogs() {
        return this.egressAccessLogs == null ? Output.empty() : this.egressAccessLogs;
    }

    /**
     * The configuration parameters for egress access logging.
     * 
     */
    @Import(name="ingressAccessLogs")
      private final @Nullable Output<ChannelLogConfigurationArgs> ingressAccessLogs;

    public Output<ChannelLogConfigurationArgs> getIngressAccessLogs() {
        return this.ingressAccessLogs == null ? Output.empty() : this.ingressAccessLogs;
    }

    /**
     * A collection of tags associated with a resource
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ChannelTagArgs>> tags;

    public Output<List<ChannelTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ChannelArgs(
        @Nullable Output<String> description,
        @Nullable Output<ChannelLogConfigurationArgs> egressAccessLogs,
        @Nullable Output<ChannelLogConfigurationArgs> ingressAccessLogs,
        @Nullable Output<List<ChannelTagArgs>> tags) {
        this.description = description;
        this.egressAccessLogs = egressAccessLogs;
        this.ingressAccessLogs = ingressAccessLogs;
        this.tags = tags;
    }

    private ChannelArgs() {
        this.description = Output.empty();
        this.egressAccessLogs = Output.empty();
        this.ingressAccessLogs = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<ChannelLogConfigurationArgs> egressAccessLogs;
        private @Nullable Output<ChannelLogConfigurationArgs> ingressAccessLogs;
        private @Nullable Output<List<ChannelTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.egressAccessLogs = defaults.egressAccessLogs;
    	      this.ingressAccessLogs = defaults.ingressAccessLogs;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder egressAccessLogs(@Nullable Output<ChannelLogConfigurationArgs> egressAccessLogs) {
            this.egressAccessLogs = egressAccessLogs;
            return this;
        }
        public Builder egressAccessLogs(@Nullable ChannelLogConfigurationArgs egressAccessLogs) {
            this.egressAccessLogs = Output.ofNullable(egressAccessLogs);
            return this;
        }
        public Builder ingressAccessLogs(@Nullable Output<ChannelLogConfigurationArgs> ingressAccessLogs) {
            this.ingressAccessLogs = ingressAccessLogs;
            return this;
        }
        public Builder ingressAccessLogs(@Nullable ChannelLogConfigurationArgs ingressAccessLogs) {
            this.ingressAccessLogs = Output.ofNullable(ingressAccessLogs);
            return this;
        }
        public Builder tags(@Nullable Output<List<ChannelTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ChannelTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(ChannelTagArgs... tags) {
            return tags(List.of(tags));
        }        public ChannelArgs build() {
            return new ChannelArgs(description, egressAccessLogs, ingressAccessLogs, tags);
        }
    }
}
