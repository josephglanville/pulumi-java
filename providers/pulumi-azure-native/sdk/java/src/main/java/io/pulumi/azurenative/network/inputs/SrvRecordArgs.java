// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SrvRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final SrvRecordArgs Empty = new SrvRecordArgs();

    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    @InputImport(name="target")
    private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    @InputImport(name="weight")
    private final @Nullable Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight == null ? Input.empty() : this.weight;
    }

    public SrvRecordArgs(
        @Nullable Input<Integer> port,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> target,
        @Nullable Input<Integer> weight) {
        this.port = port;
        this.priority = priority;
        this.target = target;
        this.weight = weight;
    }

    private SrvRecordArgs() {
        this.port = Input.empty();
        this.priority = Input.empty();
        this.target = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SrvRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> port;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> target;
        private @Nullable Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(SrvRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.priority = defaults.priority;
    	      this.target = defaults.target;
    	      this.weight = defaults.weight;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public Builder setWeight(@Nullable Input<Integer> weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = Input.ofNullable(weight);
            return this;
        }

        public SrvRecordArgs build() {
            return new SrvRecordArgs(port, priority, target, weight);
        }
    }
}
