// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.aws.rds.outputs.OptionGroupOptionOptionSetting;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OptionGroupOption {
    /**
     * A list of DB Security Groups for which the option is enabled.
     * 
     */
    private final @Nullable List<String> dbSecurityGroupMemberships;
    /**
     * The Name of the Option (e.g., MEMCACHED).
     * 
     */
    private final String optionName;
    /**
     * A list of option settings to apply.
     * 
     */
    private final @Nullable List<OptionGroupOptionOptionSetting> optionSettings;
    /**
     * The Port number when connecting to the Option (e.g., 11211).
     * 
     */
    private final @Nullable Integer port;
    /**
     * The version of the option (e.g., 13.1.0.0).
     * 
     */
    private final @Nullable String version;
    /**
     * A list of VPC Security Groups for which the option is enabled.
     * 
     */
    private final @Nullable List<String> vpcSecurityGroupMemberships;

    @OutputCustomType.Constructor
    private OptionGroupOption(
        @OutputCustomType.Parameter("dbSecurityGroupMemberships") @Nullable List<String> dbSecurityGroupMemberships,
        @OutputCustomType.Parameter("optionName") String optionName,
        @OutputCustomType.Parameter("optionSettings") @Nullable List<OptionGroupOptionOptionSetting> optionSettings,
        @OutputCustomType.Parameter("port") @Nullable Integer port,
        @OutputCustomType.Parameter("version") @Nullable String version,
        @OutputCustomType.Parameter("vpcSecurityGroupMemberships") @Nullable List<String> vpcSecurityGroupMemberships) {
        this.dbSecurityGroupMemberships = dbSecurityGroupMemberships;
        this.optionName = optionName;
        this.optionSettings = optionSettings;
        this.port = port;
        this.version = version;
        this.vpcSecurityGroupMemberships = vpcSecurityGroupMemberships;
    }

    /**
     * A list of DB Security Groups for which the option is enabled.
     * 
    */
    public List<String> getDbSecurityGroupMemberships() {
        return this.dbSecurityGroupMemberships == null ? List.of() : this.dbSecurityGroupMemberships;
    }
    /**
     * The Name of the Option (e.g., MEMCACHED).
     * 
    */
    public String getOptionName() {
        return this.optionName;
    }
    /**
     * A list of option settings to apply.
     * 
    */
    public List<OptionGroupOptionOptionSetting> getOptionSettings() {
        return this.optionSettings == null ? List.of() : this.optionSettings;
    }
    /**
     * The Port number when connecting to the Option (e.g., 11211).
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The version of the option (e.g., 13.1.0.0).
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }
    /**
     * A list of VPC Security Groups for which the option is enabled.
     * 
    */
    public List<String> getVpcSecurityGroupMemberships() {
        return this.vpcSecurityGroupMemberships == null ? List.of() : this.vpcSecurityGroupMemberships;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionGroupOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dbSecurityGroupMemberships;
        private String optionName;
        private @Nullable List<OptionGroupOptionOptionSetting> optionSettings;
        private @Nullable Integer port;
        private @Nullable String version;
        private @Nullable List<String> vpcSecurityGroupMemberships;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionGroupOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbSecurityGroupMemberships = defaults.dbSecurityGroupMemberships;
    	      this.optionName = defaults.optionName;
    	      this.optionSettings = defaults.optionSettings;
    	      this.port = defaults.port;
    	      this.version = defaults.version;
    	      this.vpcSecurityGroupMemberships = defaults.vpcSecurityGroupMemberships;
        }

        public Builder setDbSecurityGroupMemberships(@Nullable List<String> dbSecurityGroupMemberships) {
            this.dbSecurityGroupMemberships = dbSecurityGroupMemberships;
            return this;
        }

        public Builder setOptionName(String optionName) {
            this.optionName = Objects.requireNonNull(optionName);
            return this;
        }

        public Builder setOptionSettings(@Nullable List<OptionGroupOptionOptionSetting> optionSettings) {
            this.optionSettings = optionSettings;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public Builder setVpcSecurityGroupMemberships(@Nullable List<String> vpcSecurityGroupMemberships) {
            this.vpcSecurityGroupMemberships = vpcSecurityGroupMemberships;
            return this;
        }
        public OptionGroupOption build() {
            return new OptionGroupOption(dbSecurityGroupMemberships, optionName, optionSettings, port, version, vpcSecurityGroupMemberships);
        }
    }
}
