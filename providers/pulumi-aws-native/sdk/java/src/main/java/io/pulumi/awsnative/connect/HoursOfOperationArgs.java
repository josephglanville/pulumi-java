// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect;

import io.pulumi.awsnative.connect.inputs.HoursOfOperationConfigArgs;
import io.pulumi.awsnative.connect.inputs.HoursOfOperationTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HoursOfOperationArgs extends io.pulumi.resources.ResourceArgs {

    public static final HoursOfOperationArgs Empty = new HoursOfOperationArgs();

    /**
     * Configuration information for the hours of operation: day, start time, and end time.
     * 
     */
    @Import(name="config", required=true)
      private final Output<List<HoursOfOperationConfigArgs>> config;

    public Output<List<HoursOfOperationConfigArgs>> getConfig() {
        return this.config;
    }

    /**
     * The description of the hours of operation.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The identifier of the Amazon Connect instance.
     * 
     */
    @Import(name="instanceArn", required=true)
      private final Output<String> instanceArn;

    public Output<String> getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * The name of the hours of operation.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * One or more tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<HoursOfOperationTagArgs>> tags;

    public Output<List<HoursOfOperationTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The time zone of the hours of operation.
     * 
     */
    @Import(name="timeZone", required=true)
      private final Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone;
    }

    public HoursOfOperationArgs(
        Output<List<HoursOfOperationConfigArgs>> config,
        @Nullable Output<String> description,
        Output<String> instanceArn,
        @Nullable Output<String> name,
        @Nullable Output<List<HoursOfOperationTagArgs>> tags,
        Output<String> timeZone) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.description = description;
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.name = name;
        this.tags = tags;
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
    }

    private HoursOfOperationArgs() {
        this.config = Codegen.empty();
        this.description = Codegen.empty();
        this.instanceArn = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
        this.timeZone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HoursOfOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<HoursOfOperationConfigArgs>> config;
        private @Nullable Output<String> description;
        private Output<String> instanceArn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<HoursOfOperationTagArgs>> tags;
        private Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(HoursOfOperationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.description = defaults.description;
    	      this.instanceArn = defaults.instanceArn;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder config(Output<List<HoursOfOperationConfigArgs>> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder config(List<HoursOfOperationConfigArgs> config) {
            this.config = Output.of(Objects.requireNonNull(config));
            return this;
        }
        public Builder config(HoursOfOperationConfigArgs... config) {
            return config(List.of(config));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder instanceArn(Output<String> instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }
        public Builder instanceArn(String instanceArn) {
            this.instanceArn = Output.of(Objects.requireNonNull(instanceArn));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<List<HoursOfOperationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<HoursOfOperationTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(HoursOfOperationTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder timeZone(Output<String> timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public Builder timeZone(String timeZone) {
            this.timeZone = Output.of(Objects.requireNonNull(timeZone));
            return this;
        }        public HoursOfOperationArgs build() {
            return new HoursOfOperationArgs(config, description, instanceArn, name, tags, timeZone);
        }
    }
}
