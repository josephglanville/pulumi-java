// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.UserDefinedFunctionResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ViewDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ViewDefinitionArgs Empty = new ViewDefinitionArgs();

    /**
     * [Required] A query that BigQuery executes when the view is referenced.
     * 
     */
    @InputImport(name="query")
      private final @Nullable Output<String> query;

    public Output<String> getQuery() {
        return this.query == null ? Output.empty() : this.query;
    }

    /**
     * True if the column names are explicitly specified. For example by using the 'CREATE VIEW v(c1, c2) AS ...' syntax. Can only be set using BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/
     * 
     */
    @InputImport(name="useExplicitColumnNames")
      private final @Nullable Output<Boolean> useExplicitColumnNames;

    public Output<Boolean> getUseExplicitColumnNames() {
        return this.useExplicitColumnNames == null ? Output.empty() : this.useExplicitColumnNames;
    }

    /**
     * Specifies whether to use BigQuery's legacy SQL for this view. The default value is true. If set to false, the view will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/ Queries and views that reference this view must use the same flag value.
     * 
     */
    @InputImport(name="useLegacySql")
      private final @Nullable Output<Boolean> useLegacySql;

    public Output<Boolean> getUseLegacySql() {
        return this.useLegacySql == null ? Output.empty() : this.useLegacySql;
    }

    /**
     * Describes user-defined function resources used in the query.
     * 
     */
    @InputImport(name="userDefinedFunctionResources")
      private final @Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources;

    public Output<List<UserDefinedFunctionResourceArgs>> getUserDefinedFunctionResources() {
        return this.userDefinedFunctionResources == null ? Output.empty() : this.userDefinedFunctionResources;
    }

    public ViewDefinitionArgs(
        @Nullable Output<String> query,
        @Nullable Output<Boolean> useExplicitColumnNames,
        @Nullable Output<Boolean> useLegacySql,
        @Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources) {
        this.query = query;
        this.useExplicitColumnNames = useExplicitColumnNames;
        this.useLegacySql = useLegacySql;
        this.userDefinedFunctionResources = userDefinedFunctionResources;
    }

    private ViewDefinitionArgs() {
        this.query = Output.empty();
        this.useExplicitColumnNames = Output.empty();
        this.useLegacySql = Output.empty();
        this.userDefinedFunctionResources = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ViewDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> query;
        private @Nullable Output<Boolean> useExplicitColumnNames;
        private @Nullable Output<Boolean> useLegacySql;
        private @Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources;

        public Builder() {
    	      // Empty
        }

        public Builder(ViewDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.useExplicitColumnNames = defaults.useExplicitColumnNames;
    	      this.useLegacySql = defaults.useLegacySql;
    	      this.userDefinedFunctionResources = defaults.userDefinedFunctionResources;
        }

        public Builder query(@Nullable Output<String> query) {
            this.query = query;
            return this;
        }

        public Builder query(@Nullable String query) {
            this.query = Output.ofNullable(query);
            return this;
        }

        public Builder useExplicitColumnNames(@Nullable Output<Boolean> useExplicitColumnNames) {
            this.useExplicitColumnNames = useExplicitColumnNames;
            return this;
        }

        public Builder useExplicitColumnNames(@Nullable Boolean useExplicitColumnNames) {
            this.useExplicitColumnNames = Output.ofNullable(useExplicitColumnNames);
            return this;
        }

        public Builder useLegacySql(@Nullable Output<Boolean> useLegacySql) {
            this.useLegacySql = useLegacySql;
            return this;
        }

        public Builder useLegacySql(@Nullable Boolean useLegacySql) {
            this.useLegacySql = Output.ofNullable(useLegacySql);
            return this;
        }

        public Builder userDefinedFunctionResources(@Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = userDefinedFunctionResources;
            return this;
        }

        public Builder userDefinedFunctionResources(@Nullable List<UserDefinedFunctionResourceArgs> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = Output.ofNullable(userDefinedFunctionResources);
            return this;
        }
        public ViewDefinitionArgs build() {
            return new ViewDefinitionArgs(query, useExplicitColumnNames, useLegacySql, userDefinedFunctionResources);
        }
    }
}
