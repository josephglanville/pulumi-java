// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationState extends io.pulumi.resources.ResourceArgs {

    public static final ReservationState Empty = new ReservationState();

    @InputImport(name="ignoreIdleSlots")
    private final @Nullable Input<Boolean> ignoreIdleSlots;

    public Input<Boolean> getIgnoreIdleSlots() {
        return this.ignoreIdleSlots == null ? Input.empty() : this.ignoreIdleSlots;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="slotCapacity")
    private final @Nullable Input<Integer> slotCapacity;

    public Input<Integer> getSlotCapacity() {
        return this.slotCapacity == null ? Input.empty() : this.slotCapacity;
    }

    public ReservationState(
        @Nullable Input<Boolean> ignoreIdleSlots,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<Integer> slotCapacity) {
        this.ignoreIdleSlots = ignoreIdleSlots;
        this.location = location;
        this.name = name;
        this.project = project;
        this.slotCapacity = slotCapacity;
    }

    private ReservationState() {
        this.ignoreIdleSlots = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.slotCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> ignoreIdleSlots;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<Integer> slotCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreIdleSlots = defaults.ignoreIdleSlots;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.slotCapacity = defaults.slotCapacity;
        }

        public Builder setIgnoreIdleSlots(@Nullable Input<Boolean> ignoreIdleSlots) {
            this.ignoreIdleSlots = ignoreIdleSlots;
            return this;
        }

        public Builder setIgnoreIdleSlots(@Nullable Boolean ignoreIdleSlots) {
            this.ignoreIdleSlots = Input.ofNullable(ignoreIdleSlots);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSlotCapacity(@Nullable Input<Integer> slotCapacity) {
            this.slotCapacity = slotCapacity;
            return this;
        }

        public Builder setSlotCapacity(@Nullable Integer slotCapacity) {
            this.slotCapacity = Input.ofNullable(slotCapacity);
            return this;
        }

        public ReservationState build() {
            return new ReservationState(ignoreIdleSlots, location, name, project, slotCapacity);
        }
    }
}