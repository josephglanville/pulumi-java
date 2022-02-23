// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ContainerStateArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerStatus contains details for the current status of this container.
 * 
 */
public final class ContainerStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerStatusArgs Empty = new ContainerStatusArgs();

    /**
     * Container's ID in the format 'docker://<container_id>'.
     * 
     */
    @InputImport(name="containerID")
      private final @Nullable Input<String> containerID;

    public Input<String> getContainerID() {
        return this.containerID == null ? Input.empty() : this.containerID;
    }

    /**
     * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.
     * 
     */
    @InputImport(name="image", required=true)
      private final Input<String> image;

    public Input<String> getImage() {
        return this.image;
    }

    /**
     * ImageID of the container's image.
     * 
     */
    @InputImport(name="imageID", required=true)
      private final Input<String> imageID;

    public Input<String> getImageID() {
        return this.imageID;
    }

    /**
     * Details about the container's last termination condition.
     * 
     */
    @InputImport(name="lastState")
      private final @Nullable Input<ContainerStateArgs> lastState;

    public Input<ContainerStateArgs> getLastState() {
        return this.lastState == null ? Input.empty() : this.lastState;
    }

    /**
     * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Specifies whether the container has passed its readiness probe.
     * 
     */
    @InputImport(name="ready", required=true)
      private final Input<Boolean> ready;

    public Input<Boolean> getReady() {
        return this.ready;
    }

    /**
     * The number of times the container has been restarted.
     * 
     */
    @InputImport(name="restartCount", required=true)
      private final Input<Integer> restartCount;

    public Input<Integer> getRestartCount() {
        return this.restartCount;
    }

    /**
     * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
     * 
     */
    @InputImport(name="started")
      private final @Nullable Input<Boolean> started;

    public Input<Boolean> getStarted() {
        return this.started == null ? Input.empty() : this.started;
    }

    /**
     * Details about the container's current condition.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<ContainerStateArgs> state;

    public Input<ContainerStateArgs> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public ContainerStatusArgs(
        @Nullable Input<String> containerID,
        Input<String> image,
        Input<String> imageID,
        @Nullable Input<ContainerStateArgs> lastState,
        Input<String> name,
        Input<Boolean> ready,
        Input<Integer> restartCount,
        @Nullable Input<Boolean> started,
        @Nullable Input<ContainerStateArgs> state) {
        this.containerID = containerID;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.imageID = Objects.requireNonNull(imageID, "expected parameter 'imageID' to be non-null");
        this.lastState = lastState;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.ready = Objects.requireNonNull(ready, "expected parameter 'ready' to be non-null");
        this.restartCount = Objects.requireNonNull(restartCount, "expected parameter 'restartCount' to be non-null");
        this.started = started;
        this.state = state;
    }

    private ContainerStatusArgs() {
        this.containerID = Input.empty();
        this.image = Input.empty();
        this.imageID = Input.empty();
        this.lastState = Input.empty();
        this.name = Input.empty();
        this.ready = Input.empty();
        this.restartCount = Input.empty();
        this.started = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> containerID;
        private Input<String> image;
        private Input<String> imageID;
        private @Nullable Input<ContainerStateArgs> lastState;
        private Input<String> name;
        private Input<Boolean> ready;
        private Input<Integer> restartCount;
        private @Nullable Input<Boolean> started;
        private @Nullable Input<ContainerStateArgs> state;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerID = defaults.containerID;
    	      this.image = defaults.image;
    	      this.imageID = defaults.imageID;
    	      this.lastState = defaults.lastState;
    	      this.name = defaults.name;
    	      this.ready = defaults.ready;
    	      this.restartCount = defaults.restartCount;
    	      this.started = defaults.started;
    	      this.state = defaults.state;
        }

        public Builder setContainerID(@Nullable Input<String> containerID) {
            this.containerID = containerID;
            return this;
        }

        public Builder setContainerID(@Nullable String containerID) {
            this.containerID = Input.ofNullable(containerID);
            return this;
        }

        public Builder setImage(Input<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Input.of(Objects.requireNonNull(image));
            return this;
        }

        public Builder setImageID(Input<String> imageID) {
            this.imageID = Objects.requireNonNull(imageID);
            return this;
        }

        public Builder setImageID(String imageID) {
            this.imageID = Input.of(Objects.requireNonNull(imageID));
            return this;
        }

        public Builder setLastState(@Nullable Input<ContainerStateArgs> lastState) {
            this.lastState = lastState;
            return this;
        }

        public Builder setLastState(@Nullable ContainerStateArgs lastState) {
            this.lastState = Input.ofNullable(lastState);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setReady(Input<Boolean> ready) {
            this.ready = Objects.requireNonNull(ready);
            return this;
        }

        public Builder setReady(Boolean ready) {
            this.ready = Input.of(Objects.requireNonNull(ready));
            return this;
        }

        public Builder setRestartCount(Input<Integer> restartCount) {
            this.restartCount = Objects.requireNonNull(restartCount);
            return this;
        }

        public Builder setRestartCount(Integer restartCount) {
            this.restartCount = Input.of(Objects.requireNonNull(restartCount));
            return this;
        }

        public Builder setStarted(@Nullable Input<Boolean> started) {
            this.started = started;
            return this;
        }

        public Builder setStarted(@Nullable Boolean started) {
            this.started = Input.ofNullable(started);
            return this;
        }

        public Builder setState(@Nullable Input<ContainerStateArgs> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable ContainerStateArgs state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public ContainerStatusArgs build() {
            return new ContainerStatusArgs(containerID, image, imageID, lastState, name, ready, restartCount, started, state);
        }
    }
}
