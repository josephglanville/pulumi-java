// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ContainerUlimitGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerUlimitGetArgs Empty = new ContainerUlimitGetArgs();

    @Import(name="hard", required=true)
      private final Output<Integer> hard;

    public Output<Integer> getHard() {
        return this.hard;
    }

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @Import(name="soft", required=true)
      private final Output<Integer> soft;

    public Output<Integer> getSoft() {
        return this.soft;
    }

    public ContainerUlimitGetArgs(
        Output<Integer> hard,
        Output<String> name,
        Output<Integer> soft) {
        this.hard = Objects.requireNonNull(hard, "expected parameter 'hard' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.soft = Objects.requireNonNull(soft, "expected parameter 'soft' to be non-null");
    }

    private ContainerUlimitGetArgs() {
        this.hard = Codegen.empty();
        this.name = Codegen.empty();
        this.soft = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerUlimitGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> hard;
        private Output<String> name;
        private Output<Integer> soft;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerUlimitGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hard = defaults.hard;
    	      this.name = defaults.name;
    	      this.soft = defaults.soft;
        }

        public Builder hard(Output<Integer> hard) {
            this.hard = Objects.requireNonNull(hard);
            return this;
        }
        public Builder hard(Integer hard) {
            this.hard = Output.of(Objects.requireNonNull(hard));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder soft(Output<Integer> soft) {
            this.soft = Objects.requireNonNull(soft);
            return this;
        }
        public Builder soft(Integer soft) {
            this.soft = Output.of(Objects.requireNonNull(soft));
            return this;
        }        public ContainerUlimitGetArgs build() {
            return new ContainerUlimitGetArgs(hard, name, soft);
        }
    }
}
