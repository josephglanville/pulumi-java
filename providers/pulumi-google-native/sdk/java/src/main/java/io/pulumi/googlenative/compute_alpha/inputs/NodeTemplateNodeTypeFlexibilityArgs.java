// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeTemplateNodeTypeFlexibilityArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeTemplateNodeTypeFlexibilityArgs Empty = new NodeTemplateNodeTypeFlexibilityArgs();

    @Import(name="cpus")
      private final @Nullable Output<String> cpus;

    public Output<String> getCpus() {
        return this.cpus == null ? Output.empty() : this.cpus;
    }

    @Import(name="localSsd")
      private final @Nullable Output<String> localSsd;

    public Output<String> getLocalSsd() {
        return this.localSsd == null ? Output.empty() : this.localSsd;
    }

    @Import(name="memory")
      private final @Nullable Output<String> memory;

    public Output<String> getMemory() {
        return this.memory == null ? Output.empty() : this.memory;
    }

    public NodeTemplateNodeTypeFlexibilityArgs(
        @Nullable Output<String> cpus,
        @Nullable Output<String> localSsd,
        @Nullable Output<String> memory) {
        this.cpus = cpus;
        this.localSsd = localSsd;
        this.memory = memory;
    }

    private NodeTemplateNodeTypeFlexibilityArgs() {
        this.cpus = Output.empty();
        this.localSsd = Output.empty();
        this.memory = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateNodeTypeFlexibilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cpus;
        private @Nullable Output<String> localSsd;
        private @Nullable Output<String> memory;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateNodeTypeFlexibilityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpus = defaults.cpus;
    	      this.localSsd = defaults.localSsd;
    	      this.memory = defaults.memory;
        }

        public Builder cpus(@Nullable Output<String> cpus) {
            this.cpus = cpus;
            return this;
        }
        public Builder cpus(@Nullable String cpus) {
            this.cpus = Output.ofNullable(cpus);
            return this;
        }
        public Builder localSsd(@Nullable Output<String> localSsd) {
            this.localSsd = localSsd;
            return this;
        }
        public Builder localSsd(@Nullable String localSsd) {
            this.localSsd = Output.ofNullable(localSsd);
            return this;
        }
        public Builder memory(@Nullable Output<String> memory) {
            this.memory = memory;
            return this;
        }
        public Builder memory(@Nullable String memory) {
            this.memory = Output.ofNullable(memory);
            return this;
        }        public NodeTemplateNodeTypeFlexibilityArgs build() {
            return new NodeTemplateNodeTypeFlexibilityArgs(cpus, localSsd, memory);
        }
    }
}
