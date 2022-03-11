// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ContainerStateRunningArgs;
import io.pulumi.kubernetes.core_v1.inputs.ContainerStateTerminatedArgs;
import io.pulumi.kubernetes.core_v1.inputs.ContainerStateWaitingArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
 * 
 */
public final class ContainerStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerStateArgs Empty = new ContainerStateArgs();

    /**
     * Details about a running container
     * 
     */
    @InputImport(name="running")
      private final @Nullable Output<ContainerStateRunningArgs> running;

    public Output<ContainerStateRunningArgs> getRunning() {
        return this.running == null ? Output.empty() : this.running;
    }

    /**
     * Details about a terminated container
     * 
     */
    @InputImport(name="terminated")
      private final @Nullable Output<ContainerStateTerminatedArgs> terminated;

    public Output<ContainerStateTerminatedArgs> getTerminated() {
        return this.terminated == null ? Output.empty() : this.terminated;
    }

    /**
     * Details about a waiting container
     * 
     */
    @InputImport(name="waiting")
      private final @Nullable Output<ContainerStateWaitingArgs> waiting;

    public Output<ContainerStateWaitingArgs> getWaiting() {
        return this.waiting == null ? Output.empty() : this.waiting;
    }

    public ContainerStateArgs(
        @Nullable Output<ContainerStateRunningArgs> running,
        @Nullable Output<ContainerStateTerminatedArgs> terminated,
        @Nullable Output<ContainerStateWaitingArgs> waiting) {
        this.running = running;
        this.terminated = terminated;
        this.waiting = waiting;
    }

    private ContainerStateArgs() {
        this.running = Output.empty();
        this.terminated = Output.empty();
        this.waiting = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ContainerStateRunningArgs> running;
        private @Nullable Output<ContainerStateTerminatedArgs> terminated;
        private @Nullable Output<ContainerStateWaitingArgs> waiting;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.running = defaults.running;
    	      this.terminated = defaults.terminated;
    	      this.waiting = defaults.waiting;
        }

        public Builder running(@Nullable Output<ContainerStateRunningArgs> running) {
            this.running = running;
            return this;
        }

        public Builder running(@Nullable ContainerStateRunningArgs running) {
            this.running = Output.ofNullable(running);
            return this;
        }

        public Builder terminated(@Nullable Output<ContainerStateTerminatedArgs> terminated) {
            this.terminated = terminated;
            return this;
        }

        public Builder terminated(@Nullable ContainerStateTerminatedArgs terminated) {
            this.terminated = Output.ofNullable(terminated);
            return this;
        }

        public Builder waiting(@Nullable Output<ContainerStateWaitingArgs> waiting) {
            this.waiting = waiting;
            return this;
        }

        public Builder waiting(@Nullable ContainerStateWaitingArgs waiting) {
            this.waiting = Output.ofNullable(waiting);
            return this;
        }
        public ContainerStateArgs build() {
            return new ContainerStateArgs(running, terminated, waiting);
        }
    }
}
