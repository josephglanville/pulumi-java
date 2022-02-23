// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of SqlServerInstance.
 * 
 */
public final class SqlServerInstancePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlServerInstancePropertiesArgs Empty = new SqlServerInstancePropertiesArgs();

    /**
     * SQL Server collation.
     * 
     */
    @InputImport(name="collation")
      private final @Nullable Input<String> collation;

    public Input<String> getCollation() {
        return this.collation == null ? Input.empty() : this.collation;
    }

    /**
     * ARM Resource id of the container resource (Azure Arc for Servers).
     * 
     */
    @InputImport(name="containerResourceId", required=true)
      private final Input<String> containerResourceId;

    public Input<String> getContainerResourceId() {
        return this.containerResourceId;
    }

    /**
     * SQL Server current version.
     * 
     */
    @InputImport(name="currentVersion")
      private final @Nullable Input<String> currentVersion;

    public Input<String> getCurrentVersion() {
        return this.currentVersion == null ? Input.empty() : this.currentVersion;
    }

    /**
     * SQL Server edition.
     * 
     */
    @InputImport(name="edition")
      private final @Nullable Input<String> edition;

    public Input<String> getEdition() {
        return this.edition == null ? Input.empty() : this.edition;
    }

    /**
     * SQL Server instance name.
     * 
     */
    @InputImport(name="instanceName")
      private final @Nullable Input<String> instanceName;

    public Input<String> getInstanceName() {
        return this.instanceName == null ? Input.empty() : this.instanceName;
    }

    /**
     * SQL Server license type.
     * 
     */
    @InputImport(name="licenseType")
      private final @Nullable Input<String> licenseType;

    public Input<String> getLicenseType() {
        return this.licenseType == null ? Input.empty() : this.licenseType;
    }

    /**
     * SQL Server update level.
     * 
     */
    @InputImport(name="patchLevel")
      private final @Nullable Input<String> patchLevel;

    public Input<String> getPatchLevel() {
        return this.patchLevel == null ? Input.empty() : this.patchLevel;
    }

    /**
     * SQL Server product ID.
     * 
     */
    @InputImport(name="productId")
      private final @Nullable Input<String> productId;

    public Input<String> getProductId() {
        return this.productId == null ? Input.empty() : this.productId;
    }

    /**
     * The cloud connectivity status.
     * 
     */
    @InputImport(name="status", required=true)
      private final Input<String> status;

    public Input<String> getStatus() {
        return this.status;
    }

    /**
     * Dynamic TCP ports used by SQL Server.
     * 
     */
    @InputImport(name="tcpDynamicPorts")
      private final @Nullable Input<String> tcpDynamicPorts;

    public Input<String> getTcpDynamicPorts() {
        return this.tcpDynamicPorts == null ? Input.empty() : this.tcpDynamicPorts;
    }

    /**
     * Static TCP ports used by SQL Server.
     * 
     */
    @InputImport(name="tcpStaticPorts")
      private final @Nullable Input<String> tcpStaticPorts;

    public Input<String> getTcpStaticPorts() {
        return this.tcpStaticPorts == null ? Input.empty() : this.tcpStaticPorts;
    }

    /**
     * The number of logical processors used by the SQL Server instance.
     * 
     */
    @InputImport(name="vCore")
      private final @Nullable Input<String> vCore;

    public Input<String> getVCore() {
        return this.vCore == null ? Input.empty() : this.vCore;
    }

    /**
     * SQL Server version.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public SqlServerInstancePropertiesArgs(
        @Nullable Input<String> collation,
        Input<String> containerResourceId,
        @Nullable Input<String> currentVersion,
        @Nullable Input<String> edition,
        @Nullable Input<String> instanceName,
        @Nullable Input<String> licenseType,
        @Nullable Input<String> patchLevel,
        @Nullable Input<String> productId,
        Input<String> status,
        @Nullable Input<String> tcpDynamicPorts,
        @Nullable Input<String> tcpStaticPorts,
        @Nullable Input<String> vCore,
        @Nullable Input<String> version) {
        this.collation = collation;
        this.containerResourceId = Objects.requireNonNull(containerResourceId, "expected parameter 'containerResourceId' to be non-null");
        this.currentVersion = currentVersion;
        this.edition = edition;
        this.instanceName = instanceName;
        this.licenseType = licenseType;
        this.patchLevel = patchLevel;
        this.productId = productId;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.tcpDynamicPorts = tcpDynamicPorts;
        this.tcpStaticPorts = tcpStaticPorts;
        this.vCore = vCore;
        this.version = version;
    }

    private SqlServerInstancePropertiesArgs() {
        this.collation = Input.empty();
        this.containerResourceId = Input.empty();
        this.currentVersion = Input.empty();
        this.edition = Input.empty();
        this.instanceName = Input.empty();
        this.licenseType = Input.empty();
        this.patchLevel = Input.empty();
        this.productId = Input.empty();
        this.status = Input.empty();
        this.tcpDynamicPorts = Input.empty();
        this.tcpStaticPorts = Input.empty();
        this.vCore = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerInstancePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> collation;
        private Input<String> containerResourceId;
        private @Nullable Input<String> currentVersion;
        private @Nullable Input<String> edition;
        private @Nullable Input<String> instanceName;
        private @Nullable Input<String> licenseType;
        private @Nullable Input<String> patchLevel;
        private @Nullable Input<String> productId;
        private Input<String> status;
        private @Nullable Input<String> tcpDynamicPorts;
        private @Nullable Input<String> tcpStaticPorts;
        private @Nullable Input<String> vCore;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerInstancePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collation = defaults.collation;
    	      this.containerResourceId = defaults.containerResourceId;
    	      this.currentVersion = defaults.currentVersion;
    	      this.edition = defaults.edition;
    	      this.instanceName = defaults.instanceName;
    	      this.licenseType = defaults.licenseType;
    	      this.patchLevel = defaults.patchLevel;
    	      this.productId = defaults.productId;
    	      this.status = defaults.status;
    	      this.tcpDynamicPorts = defaults.tcpDynamicPorts;
    	      this.tcpStaticPorts = defaults.tcpStaticPorts;
    	      this.vCore = defaults.vCore;
    	      this.version = defaults.version;
        }

        public Builder setCollation(@Nullable Input<String> collation) {
            this.collation = collation;
            return this;
        }

        public Builder setCollation(@Nullable String collation) {
            this.collation = Input.ofNullable(collation);
            return this;
        }

        public Builder setContainerResourceId(Input<String> containerResourceId) {
            this.containerResourceId = Objects.requireNonNull(containerResourceId);
            return this;
        }

        public Builder setContainerResourceId(String containerResourceId) {
            this.containerResourceId = Input.of(Objects.requireNonNull(containerResourceId));
            return this;
        }

        public Builder setCurrentVersion(@Nullable Input<String> currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        public Builder setCurrentVersion(@Nullable String currentVersion) {
            this.currentVersion = Input.ofNullable(currentVersion);
            return this;
        }

        public Builder setEdition(@Nullable Input<String> edition) {
            this.edition = edition;
            return this;
        }

        public Builder setEdition(@Nullable String edition) {
            this.edition = Input.ofNullable(edition);
            return this;
        }

        public Builder setInstanceName(@Nullable Input<String> instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        public Builder setInstanceName(@Nullable String instanceName) {
            this.instanceName = Input.ofNullable(instanceName);
            return this;
        }

        public Builder setLicenseType(@Nullable Input<String> licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLicenseType(@Nullable String licenseType) {
            this.licenseType = Input.ofNullable(licenseType);
            return this;
        }

        public Builder setPatchLevel(@Nullable Input<String> patchLevel) {
            this.patchLevel = patchLevel;
            return this;
        }

        public Builder setPatchLevel(@Nullable String patchLevel) {
            this.patchLevel = Input.ofNullable(patchLevel);
            return this;
        }

        public Builder setProductId(@Nullable Input<String> productId) {
            this.productId = productId;
            return this;
        }

        public Builder setProductId(@Nullable String productId) {
            this.productId = Input.ofNullable(productId);
            return this;
        }

        public Builder setStatus(Input<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }

        public Builder setTcpDynamicPorts(@Nullable Input<String> tcpDynamicPorts) {
            this.tcpDynamicPorts = tcpDynamicPorts;
            return this;
        }

        public Builder setTcpDynamicPorts(@Nullable String tcpDynamicPorts) {
            this.tcpDynamicPorts = Input.ofNullable(tcpDynamicPorts);
            return this;
        }

        public Builder setTcpStaticPorts(@Nullable Input<String> tcpStaticPorts) {
            this.tcpStaticPorts = tcpStaticPorts;
            return this;
        }

        public Builder setTcpStaticPorts(@Nullable String tcpStaticPorts) {
            this.tcpStaticPorts = Input.ofNullable(tcpStaticPorts);
            return this;
        }

        public Builder setVCore(@Nullable Input<String> vCore) {
            this.vCore = vCore;
            return this;
        }

        public Builder setVCore(@Nullable String vCore) {
            this.vCore = Input.ofNullable(vCore);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public SqlServerInstancePropertiesArgs build() {
            return new SqlServerInstancePropertiesArgs(collation, containerResourceId, currentVersion, edition, instanceName, licenseType, patchLevel, productId, status, tcpDynamicPorts, tcpStaticPorts, vCore, version);
        }
    }
}
