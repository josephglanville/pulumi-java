// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Property/Properties which represent a unique ID.
 * 
 */
public final class StrongIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final StrongIdArgs Empty = new StrongIdArgs();

    /**
     * Localized descriptions.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<Map<String,String>> description;

    public Output<Map<String,String>> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Localized display name.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Output<Map<String,String>> displayName;

    public Output<Map<String,String>> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The properties which make up the unique ID.
     * 
     */
    @InputImport(name="keyPropertyNames", required=true)
      private final Output<List<String>> keyPropertyNames;

    public Output<List<String>> getKeyPropertyNames() {
        return this.keyPropertyNames;
    }

    /**
     * The Name identifying the strong ID.
     * 
     */
    @InputImport(name="strongIdName", required=true)
      private final Output<String> strongIdName;

    public Output<String> getStrongIdName() {
        return this.strongIdName;
    }

    public StrongIdArgs(
        @Nullable Output<Map<String,String>> description,
        @Nullable Output<Map<String,String>> displayName,
        Output<List<String>> keyPropertyNames,
        Output<String> strongIdName) {
        this.description = description;
        this.displayName = displayName;
        this.keyPropertyNames = Objects.requireNonNull(keyPropertyNames, "expected parameter 'keyPropertyNames' to be non-null");
        this.strongIdName = Objects.requireNonNull(strongIdName, "expected parameter 'strongIdName' to be non-null");
    }

    private StrongIdArgs() {
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.keyPropertyNames = Output.empty();
        this.strongIdName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StrongIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> description;
        private @Nullable Output<Map<String,String>> displayName;
        private Output<List<String>> keyPropertyNames;
        private Output<String> strongIdName;

        public Builder() {
    	      // Empty
        }

        public Builder(StrongIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.keyPropertyNames = defaults.keyPropertyNames;
    	      this.strongIdName = defaults.strongIdName;
        }

        public Builder description(@Nullable Output<Map<String,String>> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable Map<String,String> description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder displayName(@Nullable Output<Map<String,String>> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable Map<String,String> displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder keyPropertyNames(Output<List<String>> keyPropertyNames) {
            this.keyPropertyNames = Objects.requireNonNull(keyPropertyNames);
            return this;
        }

        public Builder keyPropertyNames(List<String> keyPropertyNames) {
            this.keyPropertyNames = Output.of(Objects.requireNonNull(keyPropertyNames));
            return this;
        }

        public Builder strongIdName(Output<String> strongIdName) {
            this.strongIdName = Objects.requireNonNull(strongIdName);
            return this;
        }

        public Builder strongIdName(String strongIdName) {
            this.strongIdName = Output.of(Objects.requireNonNull(strongIdName));
            return this;
        }
        public StrongIdArgs build() {
            return new StrongIdArgs(description, displayName, keyPropertyNames, strongIdName);
        }
    }
}
