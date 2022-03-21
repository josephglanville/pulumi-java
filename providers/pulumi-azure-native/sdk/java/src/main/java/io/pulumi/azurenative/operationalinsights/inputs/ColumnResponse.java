// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Table column.
 * 
 */
public final class ColumnResponse extends io.pulumi.resources.InvokeArgs {

    public static final ColumnResponse Empty = new ColumnResponse();

    /**
     * Column data type logical hint.
     * 
     */
    @Import(name="dataTypeHint")
      private final @Nullable String dataTypeHint;

    public Optional<String> getDataTypeHint() {
        return this.dataTypeHint == null ? Optional.empty() : Optional.ofNullable(this.dataTypeHint);
    }

    /**
     * Column description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Column display name.
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Is displayed by default.
     * 
     */
    @Import(name="isDefaultDisplay", required=true)
      private final Boolean isDefaultDisplay;

    public Boolean getIsDefaultDisplay() {
        return this.isDefaultDisplay;
    }

    /**
     * Is column hidden.
     * 
     */
    @Import(name="isHidden", required=true)
      private final Boolean isHidden;

    public Boolean getIsHidden() {
        return this.isHidden;
    }

    /**
     * Column name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Column data type.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ColumnResponse(
        @Nullable String dataTypeHint,
        @Nullable String description,
        @Nullable String displayName,
        Boolean isDefaultDisplay,
        Boolean isHidden,
        @Nullable String name,
        @Nullable String type) {
        this.dataTypeHint = dataTypeHint;
        this.description = description;
        this.displayName = displayName;
        this.isDefaultDisplay = Objects.requireNonNull(isDefaultDisplay, "expected parameter 'isDefaultDisplay' to be non-null");
        this.isHidden = Objects.requireNonNull(isHidden, "expected parameter 'isHidden' to be non-null");
        this.name = name;
        this.type = type;
    }

    private ColumnResponse() {
        this.dataTypeHint = null;
        this.description = null;
        this.displayName = null;
        this.isDefaultDisplay = null;
        this.isHidden = null;
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataTypeHint;
        private @Nullable String description;
        private @Nullable String displayName;
        private Boolean isDefaultDisplay;
        private Boolean isHidden;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTypeHint = defaults.dataTypeHint;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isDefaultDisplay = defaults.isDefaultDisplay;
    	      this.isHidden = defaults.isHidden;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder dataTypeHint(@Nullable String dataTypeHint) {
            this.dataTypeHint = dataTypeHint;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder isDefaultDisplay(Boolean isDefaultDisplay) {
            this.isDefaultDisplay = Objects.requireNonNull(isDefaultDisplay);
            return this;
        }
        public Builder isHidden(Boolean isHidden) {
            this.isHidden = Objects.requireNonNull(isHidden);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ColumnResponse build() {
            return new ColumnResponse(dataTypeHint, description, displayName, isDefaultDisplay, isHidden, name, type);
        }
    }
}
