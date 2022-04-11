// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigKerberosConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetastoreServiceHiveMetastoreConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetastoreServiceHiveMetastoreConfigArgs Empty = new MetastoreServiceHiveMetastoreConfigArgs();

    /**
     * A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml).
     * The mappings override system defaults (some keys cannot be overridden)
     * 
     */
    @Import(name="configOverrides")
      private final @Nullable Output<Map<String,String>> configOverrides;

    public Output<Map<String,String>> getConfigOverrides() {
        return this.configOverrides == null ? Codegen.empty() : this.configOverrides;
    }

    /**
     * Information used to configure the Hive metastore service as a service principal in a Kerberos realm.
     * Structure is documented below.
     * 
     */
    @Import(name="kerberosConfig")
      private final @Nullable Output<MetastoreServiceHiveMetastoreConfigKerberosConfigArgs> kerberosConfig;

    public Output<MetastoreServiceHiveMetastoreConfigKerberosConfigArgs> getKerberosConfig() {
        return this.kerberosConfig == null ? Codegen.empty() : this.kerberosConfig;
    }

    /**
     * The Hive metastore schema version.
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> getVersion() {
        return this.version;
    }

    public MetastoreServiceHiveMetastoreConfigArgs(
        @Nullable Output<Map<String,String>> configOverrides,
        @Nullable Output<MetastoreServiceHiveMetastoreConfigKerberosConfigArgs> kerberosConfig,
        Output<String> version) {
        this.configOverrides = configOverrides;
        this.kerberosConfig = kerberosConfig;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private MetastoreServiceHiveMetastoreConfigArgs() {
        this.configOverrides = Codegen.empty();
        this.kerberosConfig = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreServiceHiveMetastoreConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> configOverrides;
        private @Nullable Output<MetastoreServiceHiveMetastoreConfigKerberosConfigArgs> kerberosConfig;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(MetastoreServiceHiveMetastoreConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configOverrides = defaults.configOverrides;
    	      this.kerberosConfig = defaults.kerberosConfig;
    	      this.version = defaults.version;
        }

        public Builder configOverrides(@Nullable Output<Map<String,String>> configOverrides) {
            this.configOverrides = configOverrides;
            return this;
        }
        public Builder configOverrides(@Nullable Map<String,String> configOverrides) {
            this.configOverrides = Codegen.ofNullable(configOverrides);
            return this;
        }
        public Builder kerberosConfig(@Nullable Output<MetastoreServiceHiveMetastoreConfigKerberosConfigArgs> kerberosConfig) {
            this.kerberosConfig = kerberosConfig;
            return this;
        }
        public Builder kerberosConfig(@Nullable MetastoreServiceHiveMetastoreConfigKerberosConfigArgs kerberosConfig) {
            this.kerberosConfig = Codegen.ofNullable(kerberosConfig);
            return this;
        }
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public MetastoreServiceHiveMetastoreConfigArgs build() {
            return new MetastoreServiceHiveMetastoreConfigArgs(configOverrides, kerberosConfig, version);
        }
    }
}
