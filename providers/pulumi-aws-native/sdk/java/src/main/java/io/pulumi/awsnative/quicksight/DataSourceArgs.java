// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight;

import io.pulumi.awsnative.quicksight.enums.DataSourceType;
import io.pulumi.awsnative.quicksight.inputs.DataSourceCredentialsArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceErrorInfoArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceResourcePermissionArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceSslPropertiesArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceTagArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceVpcConnectionPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceArgs Empty = new DataSourceArgs();

    /**
     * <p>A set of alternate data source parameters that you want to share for the credentials
     *             stored with this data source. The credentials are applied in tandem with the data source
     *             parameters when you copy a data source by using a create or update request. The API
     *             operation compares the <code>DataSourceParameters</code> structure that's in the request
     *             with the structures in the <code>AlternateDataSourceParameters</code> allow list. If the
     *             structures are an exact match, the request is allowed to use the credentials from this
     *             existing data source. If the <code>AlternateDataSourceParameters</code> list is null,
     *             the <code>Credentials</code> originally used with this <code>DataSourceParameters</code>
     *             are automatically allowed.</p>
     * 
     */
    @InputImport(name="alternateDataSourceParameters")
      private final @Nullable Input<List<DataSourceParametersArgs>> alternateDataSourceParameters;

    public Input<List<DataSourceParametersArgs>> getAlternateDataSourceParameters() {
        return this.alternateDataSourceParameters == null ? Input.empty() : this.alternateDataSourceParameters;
    }

    @InputImport(name="awsAccountId")
      private final @Nullable Input<String> awsAccountId;

    public Input<String> getAwsAccountId() {
        return this.awsAccountId == null ? Input.empty() : this.awsAccountId;
    }

    @InputImport(name="credentials")
      private final @Nullable Input<DataSourceCredentialsArgs> credentials;

    public Input<DataSourceCredentialsArgs> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    @InputImport(name="dataSourceId")
      private final @Nullable Input<String> dataSourceId;

    public Input<String> getDataSourceId() {
        return this.dataSourceId == null ? Input.empty() : this.dataSourceId;
    }

    @InputImport(name="dataSourceParameters")
      private final @Nullable Input<DataSourceParametersArgs> dataSourceParameters;

    public Input<DataSourceParametersArgs> getDataSourceParameters() {
        return this.dataSourceParameters == null ? Input.empty() : this.dataSourceParameters;
    }

    @InputImport(name="errorInfo")
      private final @Nullable Input<DataSourceErrorInfoArgs> errorInfo;

    public Input<DataSourceErrorInfoArgs> getErrorInfo() {
        return this.errorInfo == null ? Input.empty() : this.errorInfo;
    }

    /**
     * <p>A display name for the data source.</p>
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * <p>A list of resource permissions on the data source.</p>
     * 
     */
    @InputImport(name="permissions")
      private final @Nullable Input<List<DataSourceResourcePermissionArgs>> permissions;

    public Input<List<DataSourceResourcePermissionArgs>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    @InputImport(name="sslProperties")
      private final @Nullable Input<DataSourceSslPropertiesArgs> sslProperties;

    public Input<DataSourceSslPropertiesArgs> getSslProperties() {
        return this.sslProperties == null ? Input.empty() : this.sslProperties;
    }

    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.</p>
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<DataSourceTagArgs>> tags;

    public Input<List<DataSourceTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="type")
      private final @Nullable Input<DataSourceType> type;

    public Input<DataSourceType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="vpcConnectionProperties")
      private final @Nullable Input<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties;

    public Input<DataSourceVpcConnectionPropertiesArgs> getVpcConnectionProperties() {
        return this.vpcConnectionProperties == null ? Input.empty() : this.vpcConnectionProperties;
    }

    public DataSourceArgs(
        @Nullable Input<List<DataSourceParametersArgs>> alternateDataSourceParameters,
        @Nullable Input<String> awsAccountId,
        @Nullable Input<DataSourceCredentialsArgs> credentials,
        @Nullable Input<String> dataSourceId,
        @Nullable Input<DataSourceParametersArgs> dataSourceParameters,
        @Nullable Input<DataSourceErrorInfoArgs> errorInfo,
        @Nullable Input<String> name,
        @Nullable Input<List<DataSourceResourcePermissionArgs>> permissions,
        @Nullable Input<DataSourceSslPropertiesArgs> sslProperties,
        @Nullable Input<List<DataSourceTagArgs>> tags,
        @Nullable Input<DataSourceType> type,
        @Nullable Input<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties) {
        this.alternateDataSourceParameters = alternateDataSourceParameters;
        this.awsAccountId = awsAccountId;
        this.credentials = credentials;
        this.dataSourceId = dataSourceId;
        this.dataSourceParameters = dataSourceParameters;
        this.errorInfo = errorInfo;
        this.name = name;
        this.permissions = permissions;
        this.sslProperties = sslProperties;
        this.tags = tags;
        this.type = type;
        this.vpcConnectionProperties = vpcConnectionProperties;
    }

    private DataSourceArgs() {
        this.alternateDataSourceParameters = Input.empty();
        this.awsAccountId = Input.empty();
        this.credentials = Input.empty();
        this.dataSourceId = Input.empty();
        this.dataSourceParameters = Input.empty();
        this.errorInfo = Input.empty();
        this.name = Input.empty();
        this.permissions = Input.empty();
        this.sslProperties = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
        this.vpcConnectionProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DataSourceParametersArgs>> alternateDataSourceParameters;
        private @Nullable Input<String> awsAccountId;
        private @Nullable Input<DataSourceCredentialsArgs> credentials;
        private @Nullable Input<String> dataSourceId;
        private @Nullable Input<DataSourceParametersArgs> dataSourceParameters;
        private @Nullable Input<DataSourceErrorInfoArgs> errorInfo;
        private @Nullable Input<String> name;
        private @Nullable Input<List<DataSourceResourcePermissionArgs>> permissions;
        private @Nullable Input<DataSourceSslPropertiesArgs> sslProperties;
        private @Nullable Input<List<DataSourceTagArgs>> tags;
        private @Nullable Input<DataSourceType> type;
        private @Nullable Input<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateDataSourceParameters = defaults.alternateDataSourceParameters;
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.credentials = defaults.credentials;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.dataSourceParameters = defaults.dataSourceParameters;
    	      this.errorInfo = defaults.errorInfo;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.sslProperties = defaults.sslProperties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vpcConnectionProperties = defaults.vpcConnectionProperties;
        }

        public Builder setAlternateDataSourceParameters(@Nullable Input<List<DataSourceParametersArgs>> alternateDataSourceParameters) {
            this.alternateDataSourceParameters = alternateDataSourceParameters;
            return this;
        }

        public Builder setAlternateDataSourceParameters(@Nullable List<DataSourceParametersArgs> alternateDataSourceParameters) {
            this.alternateDataSourceParameters = Input.ofNullable(alternateDataSourceParameters);
            return this;
        }

        public Builder setAwsAccountId(@Nullable Input<String> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }

        public Builder setAwsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = Input.ofNullable(awsAccountId);
            return this;
        }

        public Builder setCredentials(@Nullable Input<DataSourceCredentialsArgs> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable DataSourceCredentialsArgs credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder setDataSourceId(@Nullable Input<String> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setDataSourceId(@Nullable String dataSourceId) {
            this.dataSourceId = Input.ofNullable(dataSourceId);
            return this;
        }

        public Builder setDataSourceParameters(@Nullable Input<DataSourceParametersArgs> dataSourceParameters) {
            this.dataSourceParameters = dataSourceParameters;
            return this;
        }

        public Builder setDataSourceParameters(@Nullable DataSourceParametersArgs dataSourceParameters) {
            this.dataSourceParameters = Input.ofNullable(dataSourceParameters);
            return this;
        }

        public Builder setErrorInfo(@Nullable Input<DataSourceErrorInfoArgs> errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        public Builder setErrorInfo(@Nullable DataSourceErrorInfoArgs errorInfo) {
            this.errorInfo = Input.ofNullable(errorInfo);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPermissions(@Nullable Input<List<DataSourceResourcePermissionArgs>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setPermissions(@Nullable List<DataSourceResourcePermissionArgs> permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }

        public Builder setSslProperties(@Nullable Input<DataSourceSslPropertiesArgs> sslProperties) {
            this.sslProperties = sslProperties;
            return this;
        }

        public Builder setSslProperties(@Nullable DataSourceSslPropertiesArgs sslProperties) {
            this.sslProperties = Input.ofNullable(sslProperties);
            return this;
        }

        public Builder setTags(@Nullable Input<List<DataSourceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DataSourceTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setType(@Nullable Input<DataSourceType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable DataSourceType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setVpcConnectionProperties(@Nullable Input<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties) {
            this.vpcConnectionProperties = vpcConnectionProperties;
            return this;
        }

        public Builder setVpcConnectionProperties(@Nullable DataSourceVpcConnectionPropertiesArgs vpcConnectionProperties) {
            this.vpcConnectionProperties = Input.ofNullable(vpcConnectionProperties);
            return this;
        }
        public DataSourceArgs build() {
            return new DataSourceArgs(alternateDataSourceParameters, awsAccountId, credentials, dataSourceId, dataSourceParameters, errorInfo, name, permissions, sslProperties, tags, type, vpcConnectionProperties);
        }
    }
}
