// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Tables that will be included and excluded in the follower database
 * 
 */
public final class TableLevelSharingPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableLevelSharingPropertiesArgs Empty = new TableLevelSharingPropertiesArgs();

    /**
     * List of external tables exclude from the follower database
     * 
     */
    @Import(name="externalTablesToExclude")
      private final @Nullable Output<List<String>> externalTablesToExclude;

    public Output<List<String>> getExternalTablesToExclude() {
        return this.externalTablesToExclude == null ? Codegen.empty() : this.externalTablesToExclude;
    }

    /**
     * List of external tables to include in the follower database
     * 
     */
    @Import(name="externalTablesToInclude")
      private final @Nullable Output<List<String>> externalTablesToInclude;

    public Output<List<String>> getExternalTablesToInclude() {
        return this.externalTablesToInclude == null ? Codegen.empty() : this.externalTablesToInclude;
    }

    /**
     * List of materialized views exclude from the follower database
     * 
     */
    @Import(name="materializedViewsToExclude")
      private final @Nullable Output<List<String>> materializedViewsToExclude;

    public Output<List<String>> getMaterializedViewsToExclude() {
        return this.materializedViewsToExclude == null ? Codegen.empty() : this.materializedViewsToExclude;
    }

    /**
     * List of materialized views to include in the follower database
     * 
     */
    @Import(name="materializedViewsToInclude")
      private final @Nullable Output<List<String>> materializedViewsToInclude;

    public Output<List<String>> getMaterializedViewsToInclude() {
        return this.materializedViewsToInclude == null ? Codegen.empty() : this.materializedViewsToInclude;
    }

    /**
     * List of tables to exclude from the follower database
     * 
     */
    @Import(name="tablesToExclude")
      private final @Nullable Output<List<String>> tablesToExclude;

    public Output<List<String>> getTablesToExclude() {
        return this.tablesToExclude == null ? Codegen.empty() : this.tablesToExclude;
    }

    /**
     * List of tables to include in the follower database
     * 
     */
    @Import(name="tablesToInclude")
      private final @Nullable Output<List<String>> tablesToInclude;

    public Output<List<String>> getTablesToInclude() {
        return this.tablesToInclude == null ? Codegen.empty() : this.tablesToInclude;
    }

    public TableLevelSharingPropertiesArgs(
        @Nullable Output<List<String>> externalTablesToExclude,
        @Nullable Output<List<String>> externalTablesToInclude,
        @Nullable Output<List<String>> materializedViewsToExclude,
        @Nullable Output<List<String>> materializedViewsToInclude,
        @Nullable Output<List<String>> tablesToExclude,
        @Nullable Output<List<String>> tablesToInclude) {
        this.externalTablesToExclude = externalTablesToExclude;
        this.externalTablesToInclude = externalTablesToInclude;
        this.materializedViewsToExclude = materializedViewsToExclude;
        this.materializedViewsToInclude = materializedViewsToInclude;
        this.tablesToExclude = tablesToExclude;
        this.tablesToInclude = tablesToInclude;
    }

    private TableLevelSharingPropertiesArgs() {
        this.externalTablesToExclude = Codegen.empty();
        this.externalTablesToInclude = Codegen.empty();
        this.materializedViewsToExclude = Codegen.empty();
        this.materializedViewsToInclude = Codegen.empty();
        this.tablesToExclude = Codegen.empty();
        this.tablesToInclude = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableLevelSharingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> externalTablesToExclude;
        private @Nullable Output<List<String>> externalTablesToInclude;
        private @Nullable Output<List<String>> materializedViewsToExclude;
        private @Nullable Output<List<String>> materializedViewsToInclude;
        private @Nullable Output<List<String>> tablesToExclude;
        private @Nullable Output<List<String>> tablesToInclude;

        public Builder() {
    	      // Empty
        }

        public Builder(TableLevelSharingPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalTablesToExclude = defaults.externalTablesToExclude;
    	      this.externalTablesToInclude = defaults.externalTablesToInclude;
    	      this.materializedViewsToExclude = defaults.materializedViewsToExclude;
    	      this.materializedViewsToInclude = defaults.materializedViewsToInclude;
    	      this.tablesToExclude = defaults.tablesToExclude;
    	      this.tablesToInclude = defaults.tablesToInclude;
        }

        public Builder externalTablesToExclude(@Nullable Output<List<String>> externalTablesToExclude) {
            this.externalTablesToExclude = externalTablesToExclude;
            return this;
        }
        public Builder externalTablesToExclude(@Nullable List<String> externalTablesToExclude) {
            this.externalTablesToExclude = Codegen.ofNullable(externalTablesToExclude);
            return this;
        }
        public Builder externalTablesToExclude(String... externalTablesToExclude) {
            return externalTablesToExclude(List.of(externalTablesToExclude));
        }
        public Builder externalTablesToInclude(@Nullable Output<List<String>> externalTablesToInclude) {
            this.externalTablesToInclude = externalTablesToInclude;
            return this;
        }
        public Builder externalTablesToInclude(@Nullable List<String> externalTablesToInclude) {
            this.externalTablesToInclude = Codegen.ofNullable(externalTablesToInclude);
            return this;
        }
        public Builder externalTablesToInclude(String... externalTablesToInclude) {
            return externalTablesToInclude(List.of(externalTablesToInclude));
        }
        public Builder materializedViewsToExclude(@Nullable Output<List<String>> materializedViewsToExclude) {
            this.materializedViewsToExclude = materializedViewsToExclude;
            return this;
        }
        public Builder materializedViewsToExclude(@Nullable List<String> materializedViewsToExclude) {
            this.materializedViewsToExclude = Codegen.ofNullable(materializedViewsToExclude);
            return this;
        }
        public Builder materializedViewsToExclude(String... materializedViewsToExclude) {
            return materializedViewsToExclude(List.of(materializedViewsToExclude));
        }
        public Builder materializedViewsToInclude(@Nullable Output<List<String>> materializedViewsToInclude) {
            this.materializedViewsToInclude = materializedViewsToInclude;
            return this;
        }
        public Builder materializedViewsToInclude(@Nullable List<String> materializedViewsToInclude) {
            this.materializedViewsToInclude = Codegen.ofNullable(materializedViewsToInclude);
            return this;
        }
        public Builder materializedViewsToInclude(String... materializedViewsToInclude) {
            return materializedViewsToInclude(List.of(materializedViewsToInclude));
        }
        public Builder tablesToExclude(@Nullable Output<List<String>> tablesToExclude) {
            this.tablesToExclude = tablesToExclude;
            return this;
        }
        public Builder tablesToExclude(@Nullable List<String> tablesToExclude) {
            this.tablesToExclude = Codegen.ofNullable(tablesToExclude);
            return this;
        }
        public Builder tablesToExclude(String... tablesToExclude) {
            return tablesToExclude(List.of(tablesToExclude));
        }
        public Builder tablesToInclude(@Nullable Output<List<String>> tablesToInclude) {
            this.tablesToInclude = tablesToInclude;
            return this;
        }
        public Builder tablesToInclude(@Nullable List<String> tablesToInclude) {
            this.tablesToInclude = Codegen.ofNullable(tablesToInclude);
            return this;
        }
        public Builder tablesToInclude(String... tablesToInclude) {
            return tablesToInclude(List.of(tablesToInclude));
        }        public TableLevelSharingPropertiesArgs build() {
            return new TableLevelSharingPropertiesArgs(externalTablesToExclude, externalTablesToInclude, materializedViewsToExclude, materializedViewsToInclude, tablesToExclude, tablesToInclude);
        }
    }
}
