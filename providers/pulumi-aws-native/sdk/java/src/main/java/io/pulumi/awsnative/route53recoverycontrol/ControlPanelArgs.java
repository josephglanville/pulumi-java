// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol;

import io.pulumi.awsnative.route53recoverycontrol.inputs.ControlPanelTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ControlPanelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ControlPanelArgs Empty = new ControlPanelArgs();

    /**
     * Cluster to associate with the Control Panel
     * 
     */
    @Import(name="clusterArn")
      private final @Nullable Output<String> clusterArn;

    public Output<String> getClusterArn() {
        return this.clusterArn == null ? Output.empty() : this.clusterArn;
    }

    /**
     * The name of the control panel. You can use any non-white space character in the name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A collection of tags associated with a resource
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ControlPanelTagArgs>> tags;

    public Output<List<ControlPanelTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ControlPanelArgs(
        @Nullable Output<String> clusterArn,
        @Nullable Output<String> name,
        @Nullable Output<List<ControlPanelTagArgs>> tags) {
        this.clusterArn = clusterArn;
        this.name = name;
        this.tags = tags;
    }

    private ControlPanelArgs() {
        this.clusterArn = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlPanelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterArn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ControlPanelTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ControlPanelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder clusterArn(@Nullable Output<String> clusterArn) {
            this.clusterArn = clusterArn;
            return this;
        }
        public Builder clusterArn(@Nullable String clusterArn) {
            this.clusterArn = Output.ofNullable(clusterArn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<List<ControlPanelTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ControlPanelTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(ControlPanelTagArgs... tags) {
            return tags(List.of(tags));
        }        public ControlPanelArgs build() {
            return new ControlPanelArgs(clusterArn, name, tags);
        }
    }
}
