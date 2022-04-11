// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FolderExclusionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FolderExclusionArgs Empty = new FolderExclusionArgs();

    /**
     * A human-readable description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     * 
     */
    @Import(name="filter", required=true)
      private final Output<String> filter;

    public Output<String> getFilter() {
        return this.filter;
    }

    /**
     * The folder to be exported to the sink. Note that either [FOLDER_ID] or "folders/[FOLDER_ID]" is
     * accepted.
     * 
     */
    @Import(name="folder", required=true)
      private final Output<String> folder;

    public Output<String> getFolder() {
        return this.folder;
    }

    /**
     * The name of the logging exclusion.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public FolderExclusionArgs(
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disabled,
        Output<String> filter,
        Output<String> folder,
        @Nullable Output<String> name) {
        this.description = description;
        this.disabled = disabled;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.folder = Objects.requireNonNull(folder, "expected parameter 'folder' to be non-null");
        this.name = name;
    }

    private FolderExclusionArgs() {
        this.description = Codegen.empty();
        this.disabled = Codegen.empty();
        this.filter = Codegen.empty();
        this.folder = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disabled;
        private Output<String> filter;
        private Output<String> folder;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderExclusionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.folder = defaults.folder;
    	      this.name = defaults.name;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder filter(Output<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Output.of(Objects.requireNonNull(filter));
            return this;
        }
        public Builder folder(Output<String> folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }
        public Builder folder(String folder) {
            this.folder = Output.of(Objects.requireNonNull(folder));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public FolderExclusionArgs build() {
            return new FolderExclusionArgs(description, disabled, filter, folder, name);
        }
    }
}
