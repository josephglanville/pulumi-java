// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEngineVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEngineVersionArgs Empty = new GetEngineVersionArgs();

    /**
     * DB engine. Engine values include `aurora`, `aurora-mysql`, `aurora-postgresql`, `docdb`, `mariadb`, `mysql`, `neptune`, `oracle-ee`, `oracle-se`, `oracle-se1`, `oracle-se2`, `postgres`, `sqlserver-ee`, `sqlserver-ex`, `sqlserver-se`, and `sqlserver-web`.
     * 
     */
    @Import(name="engine", required=true)
      private final String engine;

    public String getEngine() {
        return this.engine;
    }

    /**
     * The name of a specific DB parameter group family. Examples of parameter group families are `mysql8.0`, `mariadb10.4`, and `postgres12`.
     * 
     */
    @Import(name="parameterGroupFamily")
      private final @Nullable String parameterGroupFamily;

    public Optional<String> getParameterGroupFamily() {
        return this.parameterGroupFamily == null ? Optional.empty() : Optional.ofNullable(this.parameterGroupFamily);
    }

    /**
     * Ordered list of preferred engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. If both the `version` and `preferred_versions` arguments are not configured, the data source will return the default version for the engine.
     * 
     */
    @Import(name="preferredVersions")
      private final @Nullable List<String> preferredVersions;

    public List<String> getPreferredVersions() {
        return this.preferredVersions == null ? List.of() : this.preferredVersions;
    }

    /**
     * Version of the DB engine. For example, `5.7.22`, `10.1.34`, and `12.3`. If both the `version` and `preferred_versions` arguments are not configured, the data source will return the default version for the engine.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public GetEngineVersionArgs(
        String engine,
        @Nullable String parameterGroupFamily,
        @Nullable List<String> preferredVersions,
        @Nullable String version) {
        this.engine = Objects.requireNonNull(engine, "expected parameter 'engine' to be non-null");
        this.parameterGroupFamily = parameterGroupFamily;
        this.preferredVersions = preferredVersions;
        this.version = version;
    }

    private GetEngineVersionArgs() {
        this.engine = null;
        this.parameterGroupFamily = null;
        this.preferredVersions = List.of();
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEngineVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String engine;
        private @Nullable String parameterGroupFamily;
        private @Nullable List<String> preferredVersions;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEngineVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.engine = defaults.engine;
    	      this.parameterGroupFamily = defaults.parameterGroupFamily;
    	      this.preferredVersions = defaults.preferredVersions;
    	      this.version = defaults.version;
        }

        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        public Builder parameterGroupFamily(@Nullable String parameterGroupFamily) {
            this.parameterGroupFamily = parameterGroupFamily;
            return this;
        }
        public Builder preferredVersions(@Nullable List<String> preferredVersions) {
            this.preferredVersions = preferredVersions;
            return this;
        }
        public Builder preferredVersions(String... preferredVersions) {
            return preferredVersions(List.of(preferredVersions));
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public GetEngineVersionArgs build() {
            return new GetEngineVersionArgs(engine, parameterGroupFamily, preferredVersions, version);
        }
    }
}
