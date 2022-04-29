// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.BigDataService.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BdsInstanceClusterDetail {
    /**
     * @return The URL of Ambari
     * 
     */
    private final @Nullable String ambariUrl;
    /**
     * @return Cloud SQL cell version.
     * 
     */
    private final @Nullable String bdCellVersion;
    /**
     * @return BDA version installed in the cluster
     * 
     */
    private final @Nullable String bdaVersion;
    /**
     * @return Big Data Manager version installed in the cluster.
     * 
     */
    private final @Nullable String bdmVersion;
    /**
     * @return Big Data Service version installed in the cluster.
     * 
     */
    private final @Nullable String bdsVersion;
    /**
     * @return The URL of Big Data Manager.
     * 
     */
    private final @Nullable String bigDataManagerUrl;
    /**
     * @return The URL of Cloudera Manager
     * 
     */
    private final @Nullable String clouderaManagerUrl;
    /**
     * @return Big Data SQL version.
     * 
     */
    private final @Nullable String csqlCellVersion;
    /**
     * @return Cloud SQL query server database version.
     * 
     */
    private final @Nullable String dbVersion;
    /**
     * @return The URL of the Hue server.
     * 
     */
    private final @Nullable String hueServerUrl;
    /**
     * @return Oracle Linux version installed in the cluster.
     * 
     */
    private final @Nullable String osVersion;
    /**
     * @return The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     * 
     */
    private final @Nullable String timeCreated;
    /**
     * @return The time the cluster was automatically or manually refreshed, shown as an RFC 3339 formatted datetime string.
     * 
     */
    private final @Nullable String timeRefreshed;

    @CustomType.Constructor
    private BdsInstanceClusterDetail(
        @CustomType.Parameter("ambariUrl") @Nullable String ambariUrl,
        @CustomType.Parameter("bdCellVersion") @Nullable String bdCellVersion,
        @CustomType.Parameter("bdaVersion") @Nullable String bdaVersion,
        @CustomType.Parameter("bdmVersion") @Nullable String bdmVersion,
        @CustomType.Parameter("bdsVersion") @Nullable String bdsVersion,
        @CustomType.Parameter("bigDataManagerUrl") @Nullable String bigDataManagerUrl,
        @CustomType.Parameter("clouderaManagerUrl") @Nullable String clouderaManagerUrl,
        @CustomType.Parameter("csqlCellVersion") @Nullable String csqlCellVersion,
        @CustomType.Parameter("dbVersion") @Nullable String dbVersion,
        @CustomType.Parameter("hueServerUrl") @Nullable String hueServerUrl,
        @CustomType.Parameter("osVersion") @Nullable String osVersion,
        @CustomType.Parameter("timeCreated") @Nullable String timeCreated,
        @CustomType.Parameter("timeRefreshed") @Nullable String timeRefreshed) {
        this.ambariUrl = ambariUrl;
        this.bdCellVersion = bdCellVersion;
        this.bdaVersion = bdaVersion;
        this.bdmVersion = bdmVersion;
        this.bdsVersion = bdsVersion;
        this.bigDataManagerUrl = bigDataManagerUrl;
        this.clouderaManagerUrl = clouderaManagerUrl;
        this.csqlCellVersion = csqlCellVersion;
        this.dbVersion = dbVersion;
        this.hueServerUrl = hueServerUrl;
        this.osVersion = osVersion;
        this.timeCreated = timeCreated;
        this.timeRefreshed = timeRefreshed;
    }

    /**
     * @return The URL of Ambari
     * 
     */
    public Optional<String> ambariUrl() {
        return Optional.ofNullable(this.ambariUrl);
    }
    /**
     * @return Cloud SQL cell version.
     * 
     */
    public Optional<String> bdCellVersion() {
        return Optional.ofNullable(this.bdCellVersion);
    }
    /**
     * @return BDA version installed in the cluster
     * 
     */
    public Optional<String> bdaVersion() {
        return Optional.ofNullable(this.bdaVersion);
    }
    /**
     * @return Big Data Manager version installed in the cluster.
     * 
     */
    public Optional<String> bdmVersion() {
        return Optional.ofNullable(this.bdmVersion);
    }
    /**
     * @return Big Data Service version installed in the cluster.
     * 
     */
    public Optional<String> bdsVersion() {
        return Optional.ofNullable(this.bdsVersion);
    }
    /**
     * @return The URL of Big Data Manager.
     * 
     */
    public Optional<String> bigDataManagerUrl() {
        return Optional.ofNullable(this.bigDataManagerUrl);
    }
    /**
     * @return The URL of Cloudera Manager
     * 
     */
    public Optional<String> clouderaManagerUrl() {
        return Optional.ofNullable(this.clouderaManagerUrl);
    }
    /**
     * @return Big Data SQL version.
     * 
     */
    public Optional<String> csqlCellVersion() {
        return Optional.ofNullable(this.csqlCellVersion);
    }
    /**
     * @return Cloud SQL query server database version.
     * 
     */
    public Optional<String> dbVersion() {
        return Optional.ofNullable(this.dbVersion);
    }
    /**
     * @return The URL of the Hue server.
     * 
     */
    public Optional<String> hueServerUrl() {
        return Optional.ofNullable(this.hueServerUrl);
    }
    /**
     * @return Oracle Linux version installed in the cluster.
     * 
     */
    public Optional<String> osVersion() {
        return Optional.ofNullable(this.osVersion);
    }
    /**
     * @return The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     * 
     */
    public Optional<String> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }
    /**
     * @return The time the cluster was automatically or manually refreshed, shown as an RFC 3339 formatted datetime string.
     * 
     */
    public Optional<String> timeRefreshed() {
        return Optional.ofNullable(this.timeRefreshed);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BdsInstanceClusterDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ambariUrl;
        private @Nullable String bdCellVersion;
        private @Nullable String bdaVersion;
        private @Nullable String bdmVersion;
        private @Nullable String bdsVersion;
        private @Nullable String bigDataManagerUrl;
        private @Nullable String clouderaManagerUrl;
        private @Nullable String csqlCellVersion;
        private @Nullable String dbVersion;
        private @Nullable String hueServerUrl;
        private @Nullable String osVersion;
        private @Nullable String timeCreated;
        private @Nullable String timeRefreshed;

        public Builder() {
    	      // Empty
        }

        public Builder(BdsInstanceClusterDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ambariUrl = defaults.ambariUrl;
    	      this.bdCellVersion = defaults.bdCellVersion;
    	      this.bdaVersion = defaults.bdaVersion;
    	      this.bdmVersion = defaults.bdmVersion;
    	      this.bdsVersion = defaults.bdsVersion;
    	      this.bigDataManagerUrl = defaults.bigDataManagerUrl;
    	      this.clouderaManagerUrl = defaults.clouderaManagerUrl;
    	      this.csqlCellVersion = defaults.csqlCellVersion;
    	      this.dbVersion = defaults.dbVersion;
    	      this.hueServerUrl = defaults.hueServerUrl;
    	      this.osVersion = defaults.osVersion;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeRefreshed = defaults.timeRefreshed;
        }

        public Builder ambariUrl(@Nullable String ambariUrl) {
            this.ambariUrl = ambariUrl;
            return this;
        }
        public Builder bdCellVersion(@Nullable String bdCellVersion) {
            this.bdCellVersion = bdCellVersion;
            return this;
        }
        public Builder bdaVersion(@Nullable String bdaVersion) {
            this.bdaVersion = bdaVersion;
            return this;
        }
        public Builder bdmVersion(@Nullable String bdmVersion) {
            this.bdmVersion = bdmVersion;
            return this;
        }
        public Builder bdsVersion(@Nullable String bdsVersion) {
            this.bdsVersion = bdsVersion;
            return this;
        }
        public Builder bigDataManagerUrl(@Nullable String bigDataManagerUrl) {
            this.bigDataManagerUrl = bigDataManagerUrl;
            return this;
        }
        public Builder clouderaManagerUrl(@Nullable String clouderaManagerUrl) {
            this.clouderaManagerUrl = clouderaManagerUrl;
            return this;
        }
        public Builder csqlCellVersion(@Nullable String csqlCellVersion) {
            this.csqlCellVersion = csqlCellVersion;
            return this;
        }
        public Builder dbVersion(@Nullable String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public Builder hueServerUrl(@Nullable String hueServerUrl) {
            this.hueServerUrl = hueServerUrl;
            return this;
        }
        public Builder osVersion(@Nullable String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public Builder timeCreated(@Nullable String timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }
        public Builder timeRefreshed(@Nullable String timeRefreshed) {
            this.timeRefreshed = timeRefreshed;
            return this;
        }        public BdsInstanceClusterDetail build() {
            return new BdsInstanceClusterDetail(ambariUrl, bdCellVersion, bdaVersion, bdmVersion, bdsVersion, bigDataManagerUrl, clouderaManagerUrl, csqlCellVersion, dbVersion, hueServerUrl, osVersion, timeCreated, timeRefreshed);
        }
    }
}
