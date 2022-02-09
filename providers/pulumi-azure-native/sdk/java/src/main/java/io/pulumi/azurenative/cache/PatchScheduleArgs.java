// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache;

import io.pulumi.azurenative.cache.inputs.ScheduleEntryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchScheduleArgs Empty = new PatchScheduleArgs();

    @InputImport(name="default")
    private final @Nullable Input<String> $default;

    public Input<String> get$default() {
        return this.$default == null ? Input.empty() : this.$default;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="scheduleEntries", required=true)
    private final Input<List<ScheduleEntryArgs>> scheduleEntries;

    public Input<List<ScheduleEntryArgs>> getScheduleEntries() {
        return this.scheduleEntries;
    }

    public PatchScheduleArgs(
        @Nullable Input<String> $default,
        Input<String> name,
        Input<String> resourceGroupName,
        Input<List<ScheduleEntryArgs>> scheduleEntries) {
        this.$default = $default;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scheduleEntries = Objects.requireNonNull(scheduleEntries, "expected parameter 'scheduleEntries' to be non-null");
    }

    private PatchScheduleArgs() {
        this.$default = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scheduleEntries = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> $default;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private Input<List<ScheduleEntryArgs>> scheduleEntries;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scheduleEntries = defaults.scheduleEntries;
        }

        public Builder set$default(@Nullable Input<String> $default) {
            this.$default = $default;
            return this;
        }

        public Builder set$default(@Nullable String $default) {
            this.$default = Input.ofNullable($default);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setScheduleEntries(Input<List<ScheduleEntryArgs>> scheduleEntries) {
            this.scheduleEntries = Objects.requireNonNull(scheduleEntries);
            return this;
        }

        public Builder setScheduleEntries(List<ScheduleEntryArgs> scheduleEntries) {
            this.scheduleEntries = Input.of(Objects.requireNonNull(scheduleEntries));
            return this;
        }

        public PatchScheduleArgs build() {
            return new PatchScheduleArgs($default, name, resourceGroupName, scheduleEntries);
        }
    }
}
