// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.inputs;

import io.pulumi.awsnative.frauddetector.inputs.DetectorTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetectorEntityTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorEntityTypeArgs Empty = new DetectorEntityTypeArgs();

    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The time when the entity type was created.
     * 
     */
    @InputImport(name="createdTime")
      private final @Nullable Output<String> createdTime;

    public Output<String> getCreatedTime() {
        return this.createdTime == null ? Output.empty() : this.createdTime;
    }

    /**
     * The description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @InputImport(name="inline")
      private final @Nullable Output<Boolean> inline;

    public Output<Boolean> getInline() {
        return this.inline == null ? Output.empty() : this.inline;
    }

    /**
     * The time when the entity type was last updated.
     * 
     */
    @InputImport(name="lastUpdatedTime")
      private final @Nullable Output<String> lastUpdatedTime;

    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Output.empty() : this.lastUpdatedTime;
    }

    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Tags associated with this entity type.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<DetectorTagArgs>> tags;

    public Output<List<DetectorTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public DetectorEntityTypeArgs(
        @Nullable Output<String> arn,
        @Nullable Output<String> createdTime,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> inline,
        @Nullable Output<String> lastUpdatedTime,
        @Nullable Output<String> name,
        @Nullable Output<List<DetectorTagArgs>> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.inline = inline;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.tags = tags;
    }

    private DetectorEntityTypeArgs() {
        this.arn = Output.empty();
        this.createdTime = Output.empty();
        this.description = Output.empty();
        this.inline = Output.empty();
        this.lastUpdatedTime = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorEntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> createdTime;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> inline;
        private @Nullable Output<String> lastUpdatedTime;
        private @Nullable Output<String> name;
        private @Nullable Output<List<DetectorTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorEntityTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.inline = defaults.inline;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder createdTime(@Nullable Output<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = Output.ofNullable(createdTime);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder inline(@Nullable Output<Boolean> inline) {
            this.inline = inline;
            return this;
        }

        public Builder inline(@Nullable Boolean inline) {
            this.inline = Output.ofNullable(inline);
            return this;
        }

        public Builder lastUpdatedTime(@Nullable Output<String> lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = Output.ofNullable(lastUpdatedTime);
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

        public Builder tags(@Nullable Output<List<DetectorTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<DetectorTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public DetectorEntityTypeArgs build() {
            return new DetectorEntityTypeArgs(arn, createdTime, description, inline, lastUpdatedTime, name, tags);
        }
    }
}
