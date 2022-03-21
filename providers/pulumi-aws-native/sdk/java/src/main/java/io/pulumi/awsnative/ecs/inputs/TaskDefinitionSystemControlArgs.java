// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionSystemControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionSystemControlArgs Empty = new TaskDefinitionSystemControlArgs();

    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Output.empty() : this.namespace;
    }

    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public TaskDefinitionSystemControlArgs(
        @Nullable Output<String> namespace,
        @Nullable Output<String> value) {
        this.namespace = namespace;
        this.value = value;
    }

    private TaskDefinitionSystemControlArgs() {
        this.namespace = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionSystemControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> namespace;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionSystemControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
    	      this.value = defaults.value;
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Output.ofNullable(namespace);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }        public TaskDefinitionSystemControlArgs build() {
            return new TaskDefinitionSystemControlArgs(namespace, value);
        }
    }
}
