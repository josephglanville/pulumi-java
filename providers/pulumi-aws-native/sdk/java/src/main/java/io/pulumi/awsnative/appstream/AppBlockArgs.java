// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream;

import io.pulumi.awsnative.appstream.inputs.AppBlockS3LocationArgs;
import io.pulumi.awsnative.appstream.inputs.AppBlockScriptDetailsArgs;
import io.pulumi.awsnative.appstream.inputs.AppBlockTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppBlockArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppBlockArgs Empty = new AppBlockArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="setupScriptDetails", required=true)
      private final Output<AppBlockScriptDetailsArgs> setupScriptDetails;

    public Output<AppBlockScriptDetailsArgs> getSetupScriptDetails() {
        return this.setupScriptDetails;
    }

    @Import(name="sourceS3Location", required=true)
      private final Output<AppBlockS3LocationArgs> sourceS3Location;

    public Output<AppBlockS3LocationArgs> getSourceS3Location() {
        return this.sourceS3Location;
    }

    @Import(name="tags")
      private final @Nullable Output<List<AppBlockTagArgs>> tags;

    public Output<List<AppBlockTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public AppBlockArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<String> name,
        Output<AppBlockScriptDetailsArgs> setupScriptDetails,
        Output<AppBlockS3LocationArgs> sourceS3Location,
        @Nullable Output<List<AppBlockTagArgs>> tags) {
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.setupScriptDetails = Objects.requireNonNull(setupScriptDetails, "expected parameter 'setupScriptDetails' to be non-null");
        this.sourceS3Location = Objects.requireNonNull(sourceS3Location, "expected parameter 'sourceS3Location' to be non-null");
        this.tags = tags;
    }

    private AppBlockArgs() {
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.name = Output.empty();
        this.setupScriptDetails = Output.empty();
        this.sourceS3Location = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> name;
        private Output<AppBlockScriptDetailsArgs> setupScriptDetails;
        private Output<AppBlockS3LocationArgs> sourceS3Location;
        private @Nullable Output<List<AppBlockTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AppBlockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.setupScriptDetails = defaults.setupScriptDetails;
    	      this.sourceS3Location = defaults.sourceS3Location;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
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
        public Builder setupScriptDetails(Output<AppBlockScriptDetailsArgs> setupScriptDetails) {
            this.setupScriptDetails = Objects.requireNonNull(setupScriptDetails);
            return this;
        }
        public Builder setupScriptDetails(AppBlockScriptDetailsArgs setupScriptDetails) {
            this.setupScriptDetails = Output.of(Objects.requireNonNull(setupScriptDetails));
            return this;
        }
        public Builder sourceS3Location(Output<AppBlockS3LocationArgs> sourceS3Location) {
            this.sourceS3Location = Objects.requireNonNull(sourceS3Location);
            return this;
        }
        public Builder sourceS3Location(AppBlockS3LocationArgs sourceS3Location) {
            this.sourceS3Location = Output.of(Objects.requireNonNull(sourceS3Location));
            return this;
        }
        public Builder tags(@Nullable Output<List<AppBlockTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<AppBlockTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(AppBlockTagArgs... tags) {
            return tags(List.of(tags));
        }        public AppBlockArgs build() {
            return new AppBlockArgs(description, displayName, name, setupScriptDetails, sourceS3Location, tags);
        }
    }
}
