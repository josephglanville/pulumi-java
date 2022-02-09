// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableLevelSharingPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final TableLevelSharingPropertiesResponse Empty = new TableLevelSharingPropertiesResponse();

    @InputImport(name="externalTablesToExclude")
    private final @Nullable List<String> externalTablesToExclude;

    public List<String> getExternalTablesToExclude() {
        return this.externalTablesToExclude == null ? List.of() : this.externalTablesToExclude;
    }

    @InputImport(name="externalTablesToInclude")
    private final @Nullable List<String> externalTablesToInclude;

    public List<String> getExternalTablesToInclude() {
        return this.externalTablesToInclude == null ? List.of() : this.externalTablesToInclude;
    }

    @InputImport(name="materializedViewsToExclude")
    private final @Nullable List<String> materializedViewsToExclude;

    public List<String> getMaterializedViewsToExclude() {
        return this.materializedViewsToExclude == null ? List.of() : this.materializedViewsToExclude;
    }

    @InputImport(name="materializedViewsToInclude")
    private final @Nullable List<String> materializedViewsToInclude;

    public List<String> getMaterializedViewsToInclude() {
        return this.materializedViewsToInclude == null ? List.of() : this.materializedViewsToInclude;
    }

    @InputImport(name="tablesToExclude")
    private final @Nullable List<String> tablesToExclude;

    public List<String> getTablesToExclude() {
        return this.tablesToExclude == null ? List.of() : this.tablesToExclude;
    }

    @InputImport(name="tablesToInclude")
    private final @Nullable List<String> tablesToInclude;

    public List<String> getTablesToInclude() {
        return this.tablesToInclude == null ? List.of() : this.tablesToInclude;
    }

    public TableLevelSharingPropertiesResponse(
        @Nullable List<String> externalTablesToExclude,
        @Nullable List<String> externalTablesToInclude,
        @Nullable List<String> materializedViewsToExclude,
        @Nullable List<String> materializedViewsToInclude,
        @Nullable List<String> tablesToExclude,
        @Nullable List<String> tablesToInclude) {
        this.externalTablesToExclude = externalTablesToExclude;
        this.externalTablesToInclude = externalTablesToInclude;
        this.materializedViewsToExclude = materializedViewsToExclude;
        this.materializedViewsToInclude = materializedViewsToInclude;
        this.tablesToExclude = tablesToExclude;
        this.tablesToInclude = tablesToInclude;
    }

    private TableLevelSharingPropertiesResponse() {
        this.externalTablesToExclude = List.of();
        this.externalTablesToInclude = List.of();
        this.materializedViewsToExclude = List.of();
        this.materializedViewsToInclude = List.of();
        this.tablesToExclude = List.of();
        this.tablesToInclude = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableLevelSharingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> externalTablesToExclude;
        private @Nullable List<String> externalTablesToInclude;
        private @Nullable List<String> materializedViewsToExclude;
        private @Nullable List<String> materializedViewsToInclude;
        private @Nullable List<String> tablesToExclude;
        private @Nullable List<String> tablesToInclude;

        public Builder() {
    	      // Empty
        }

        public Builder(TableLevelSharingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalTablesToExclude = defaults.externalTablesToExclude;
    	      this.externalTablesToInclude = defaults.externalTablesToInclude;
    	      this.materializedViewsToExclude = defaults.materializedViewsToExclude;
    	      this.materializedViewsToInclude = defaults.materializedViewsToInclude;
    	      this.tablesToExclude = defaults.tablesToExclude;
    	      this.tablesToInclude = defaults.tablesToInclude;
        }

        public Builder setExternalTablesToExclude(@Nullable List<String> externalTablesToExclude) {
            this.externalTablesToExclude = externalTablesToExclude;
            return this;
        }

        public Builder setExternalTablesToInclude(@Nullable List<String> externalTablesToInclude) {
            this.externalTablesToInclude = externalTablesToInclude;
            return this;
        }

        public Builder setMaterializedViewsToExclude(@Nullable List<String> materializedViewsToExclude) {
            this.materializedViewsToExclude = materializedViewsToExclude;
            return this;
        }

        public Builder setMaterializedViewsToInclude(@Nullable List<String> materializedViewsToInclude) {
            this.materializedViewsToInclude = materializedViewsToInclude;
            return this;
        }

        public Builder setTablesToExclude(@Nullable List<String> tablesToExclude) {
            this.tablesToExclude = tablesToExclude;
            return this;
        }

        public Builder setTablesToInclude(@Nullable List<String> tablesToInclude) {
            this.tablesToInclude = tablesToInclude;
            return this;
        }

        public TableLevelSharingPropertiesResponse build() {
            return new TableLevelSharingPropertiesResponse(externalTablesToExclude, externalTablesToInclude, materializedViewsToExclude, materializedViewsToInclude, tablesToExclude, tablesToInclude);
        }
    }
}
