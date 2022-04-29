// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMysqlDbSystemsDbSystemChannelTarget {
    /**
     * @return The username for the replication applier of the target MySQL DB System.
     * 
     */
    private final String applierUsername;
    /**
     * @return The case-insensitive name that identifies the replication channel. Channel names must follow the rules defined for [MySQL identifiers](https://dev.mysql.com/doc/refman/8.0/en/identifiers.html). The names of non-Deleted Channels must be unique for each DB System.
     * 
     */
    private final String channelName;
    /**
     * @return The DB System [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String dbSystemId;
    /**
     * @return The specific target identifier.
     * 
     */
    private final String targetType;

    @CustomType.Constructor
    private GetMysqlDbSystemsDbSystemChannelTarget(
        @CustomType.Parameter("applierUsername") String applierUsername,
        @CustomType.Parameter("channelName") String channelName,
        @CustomType.Parameter("dbSystemId") String dbSystemId,
        @CustomType.Parameter("targetType") String targetType) {
        this.applierUsername = applierUsername;
        this.channelName = channelName;
        this.dbSystemId = dbSystemId;
        this.targetType = targetType;
    }

    /**
     * @return The username for the replication applier of the target MySQL DB System.
     * 
     */
    public String applierUsername() {
        return this.applierUsername;
    }
    /**
     * @return The case-insensitive name that identifies the replication channel. Channel names must follow the rules defined for [MySQL identifiers](https://dev.mysql.com/doc/refman/8.0/en/identifiers.html). The names of non-Deleted Channels must be unique for each DB System.
     * 
     */
    public String channelName() {
        return this.channelName;
    }
    /**
     * @return The DB System [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String dbSystemId() {
        return this.dbSystemId;
    }
    /**
     * @return The specific target identifier.
     * 
     */
    public String targetType() {
        return this.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMysqlDbSystemsDbSystemChannelTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applierUsername;
        private String channelName;
        private String dbSystemId;
        private String targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMysqlDbSystemsDbSystemChannelTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applierUsername = defaults.applierUsername;
    	      this.channelName = defaults.channelName;
    	      this.dbSystemId = defaults.dbSystemId;
    	      this.targetType = defaults.targetType;
        }

        public Builder applierUsername(String applierUsername) {
            this.applierUsername = Objects.requireNonNull(applierUsername);
            return this;
        }
        public Builder channelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = Objects.requireNonNull(dbSystemId);
            return this;
        }
        public Builder targetType(String targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }        public GetMysqlDbSystemsDbSystemChannelTarget build() {
            return new GetMysqlDbSystemsDbSystemChannelTarget(applierUsername, channelName, dbSystemId, targetType);
        }
    }
}
