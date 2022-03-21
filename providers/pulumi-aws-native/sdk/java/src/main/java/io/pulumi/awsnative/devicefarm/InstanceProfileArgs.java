// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm;

import io.pulumi.awsnative.devicefarm.inputs.InstanceProfileTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceProfileArgs Empty = new InstanceProfileArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="excludeAppPackagesFromCleanup")
      private final @Nullable Output<List<String>> excludeAppPackagesFromCleanup;

    public Output<List<String>> getExcludeAppPackagesFromCleanup() {
        return this.excludeAppPackagesFromCleanup == null ? Output.empty() : this.excludeAppPackagesFromCleanup;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="packageCleanup")
      private final @Nullable Output<Boolean> packageCleanup;

    public Output<Boolean> getPackageCleanup() {
        return this.packageCleanup == null ? Output.empty() : this.packageCleanup;
    }

    @Import(name="rebootAfterUse")
      private final @Nullable Output<Boolean> rebootAfterUse;

    public Output<Boolean> getRebootAfterUse() {
        return this.rebootAfterUse == null ? Output.empty() : this.rebootAfterUse;
    }

    @Import(name="tags")
      private final @Nullable Output<List<InstanceProfileTagArgs>> tags;

    public Output<List<InstanceProfileTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public InstanceProfileArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<String>> excludeAppPackagesFromCleanup,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> packageCleanup,
        @Nullable Output<Boolean> rebootAfterUse,
        @Nullable Output<List<InstanceProfileTagArgs>> tags) {
        this.description = description;
        this.excludeAppPackagesFromCleanup = excludeAppPackagesFromCleanup;
        this.name = name;
        this.packageCleanup = packageCleanup;
        this.rebootAfterUse = rebootAfterUse;
        this.tags = tags;
    }

    private InstanceProfileArgs() {
        this.description = Output.empty();
        this.excludeAppPackagesFromCleanup = Output.empty();
        this.name = Output.empty();
        this.packageCleanup = Output.empty();
        this.rebootAfterUse = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> excludeAppPackagesFromCleanup;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> packageCleanup;
        private @Nullable Output<Boolean> rebootAfterUse;
        private @Nullable Output<List<InstanceProfileTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.excludeAppPackagesFromCleanup = defaults.excludeAppPackagesFromCleanup;
    	      this.name = defaults.name;
    	      this.packageCleanup = defaults.packageCleanup;
    	      this.rebootAfterUse = defaults.rebootAfterUse;
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
        public Builder excludeAppPackagesFromCleanup(@Nullable Output<List<String>> excludeAppPackagesFromCleanup) {
            this.excludeAppPackagesFromCleanup = excludeAppPackagesFromCleanup;
            return this;
        }
        public Builder excludeAppPackagesFromCleanup(@Nullable List<String> excludeAppPackagesFromCleanup) {
            this.excludeAppPackagesFromCleanup = Output.ofNullable(excludeAppPackagesFromCleanup);
            return this;
        }
        public Builder excludeAppPackagesFromCleanup(String... excludeAppPackagesFromCleanup) {
            return excludeAppPackagesFromCleanup(List.of(excludeAppPackagesFromCleanup));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder packageCleanup(@Nullable Output<Boolean> packageCleanup) {
            this.packageCleanup = packageCleanup;
            return this;
        }
        public Builder packageCleanup(@Nullable Boolean packageCleanup) {
            this.packageCleanup = Output.ofNullable(packageCleanup);
            return this;
        }
        public Builder rebootAfterUse(@Nullable Output<Boolean> rebootAfterUse) {
            this.rebootAfterUse = rebootAfterUse;
            return this;
        }
        public Builder rebootAfterUse(@Nullable Boolean rebootAfterUse) {
            this.rebootAfterUse = Output.ofNullable(rebootAfterUse);
            return this;
        }
        public Builder tags(@Nullable Output<List<InstanceProfileTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<InstanceProfileTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(InstanceProfileTagArgs... tags) {
            return tags(List.of(tags));
        }        public InstanceProfileArgs build() {
            return new InstanceProfileArgs(description, excludeAppPackagesFromCleanup, name, packageCleanup, rebootAfterUse, tags);
        }
    }
}
