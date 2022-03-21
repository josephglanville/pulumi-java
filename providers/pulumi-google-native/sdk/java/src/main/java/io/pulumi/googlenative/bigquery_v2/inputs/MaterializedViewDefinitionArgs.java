// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaterializedViewDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaterializedViewDefinitionArgs Empty = new MaterializedViewDefinitionArgs();

    /**
     * [Optional] [TrustedTester] Enable automatic refresh of the materialized view when the base table is updated. The default value is "true".
     * 
     */
    @Import(name="enableRefresh")
      private final @Nullable Output<Boolean> enableRefresh;

    public Output<Boolean> getEnableRefresh() {
        return this.enableRefresh == null ? Output.empty() : this.enableRefresh;
    }

    /**
     * [Required] A query whose result is persisted.
     * 
     */
    @Import(name="query")
      private final @Nullable Output<String> query;

    public Output<String> getQuery() {
        return this.query == null ? Output.empty() : this.query;
    }

    /**
     * [Optional] [TrustedTester] The maximum frequency at which this materialized view will be refreshed. The default value is "1800000" (30 minutes).
     * 
     */
    @Import(name="refreshIntervalMs")
      private final @Nullable Output<String> refreshIntervalMs;

    public Output<String> getRefreshIntervalMs() {
        return this.refreshIntervalMs == null ? Output.empty() : this.refreshIntervalMs;
    }

    public MaterializedViewDefinitionArgs(
        @Nullable Output<Boolean> enableRefresh,
        @Nullable Output<String> query,
        @Nullable Output<String> refreshIntervalMs) {
        this.enableRefresh = enableRefresh;
        this.query = query;
        this.refreshIntervalMs = refreshIntervalMs;
    }

    private MaterializedViewDefinitionArgs() {
        this.enableRefresh = Output.empty();
        this.query = Output.empty();
        this.refreshIntervalMs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaterializedViewDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableRefresh;
        private @Nullable Output<String> query;
        private @Nullable Output<String> refreshIntervalMs;

        public Builder() {
    	      // Empty
        }

        public Builder(MaterializedViewDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableRefresh = defaults.enableRefresh;
    	      this.query = defaults.query;
    	      this.refreshIntervalMs = defaults.refreshIntervalMs;
        }

        public Builder enableRefresh(@Nullable Output<Boolean> enableRefresh) {
            this.enableRefresh = enableRefresh;
            return this;
        }
        public Builder enableRefresh(@Nullable Boolean enableRefresh) {
            this.enableRefresh = Output.ofNullable(enableRefresh);
            return this;
        }
        public Builder query(@Nullable Output<String> query) {
            this.query = query;
            return this;
        }
        public Builder query(@Nullable String query) {
            this.query = Output.ofNullable(query);
            return this;
        }
        public Builder refreshIntervalMs(@Nullable Output<String> refreshIntervalMs) {
            this.refreshIntervalMs = refreshIntervalMs;
            return this;
        }
        public Builder refreshIntervalMs(@Nullable String refreshIntervalMs) {
            this.refreshIntervalMs = Output.ofNullable(refreshIntervalMs);
            return this;
        }        public MaterializedViewDefinitionArgs build() {
            return new MaterializedViewDefinitionArgs(enableRefresh, query, refreshIntervalMs);
        }
    }
}
