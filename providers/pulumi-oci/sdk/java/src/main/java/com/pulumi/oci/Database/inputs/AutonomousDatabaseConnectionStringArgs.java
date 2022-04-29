// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.AutonomousDatabaseConnectionStringProfileArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutonomousDatabaseConnectionStringArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutonomousDatabaseConnectionStringArgs Empty = new AutonomousDatabaseConnectionStringArgs();

    /**
     * Returns all connection strings that can be used to connect to the Autonomous Database. For more information, please see [Predefined Database Service Names for Autonomous Transaction Processing](https://docs.oracle.com/en/cloud/paas/atp-cloud/atpug/connect-predefined.html#GUID-9747539B-FD46-44F1-8FF8-F5AC650F15BE)
     * 
     */
    @Import(name="allConnectionStrings")
    private @Nullable Output<Map<String,Object>> allConnectionStrings;

    /**
     * @return Returns all connection strings that can be used to connect to the Autonomous Database. For more information, please see [Predefined Database Service Names for Autonomous Transaction Processing](https://docs.oracle.com/en/cloud/paas/atp-cloud/atpug/connect-predefined.html#GUID-9747539B-FD46-44F1-8FF8-F5AC650F15BE)
     * 
     */
    public Optional<Output<Map<String,Object>>> allConnectionStrings() {
        return Optional.ofNullable(this.allConnectionStrings);
    }

    /**
     * The database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
     * 
     */
    @Import(name="dedicated")
    private @Nullable Output<String> dedicated;

    /**
     * @return The database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
     * 
     */
    public Optional<Output<String>> dedicated() {
        return Optional.ofNullable(this.dedicated);
    }

    /**
     * The High database service provides the highest level of resources to each SQL statement resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
     * 
     */
    @Import(name="high")
    private @Nullable Output<String> high;

    /**
     * @return The High database service provides the highest level of resources to each SQL statement resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
     * 
     */
    public Optional<Output<String>> high() {
        return Optional.ofNullable(this.high);
    }

    /**
     * The Low database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
     * 
     */
    @Import(name="low")
    private @Nullable Output<String> low;

    /**
     * @return The Low database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
     * 
     */
    public Optional<Output<String>> low() {
        return Optional.ofNullable(this.low);
    }

    /**
     * The Medium database service provides a lower level of resources to each SQL statement potentially resulting a lower level of performance, but supports more concurrent SQL statements.
     * 
     */
    @Import(name="medium")
    private @Nullable Output<String> medium;

    /**
     * @return The Medium database service provides a lower level of resources to each SQL statement potentially resulting a lower level of performance, but supports more concurrent SQL statements.
     * 
     */
    public Optional<Output<String>> medium() {
        return Optional.ofNullable(this.medium);
    }

    /**
     * A list of connection string profiles to allow clients to group, filter and select connection string values based on structured metadata.
     * 
     */
    @Import(name="profiles")
    private @Nullable Output<List<AutonomousDatabaseConnectionStringProfileArgs>> profiles;

    /**
     * @return A list of connection string profiles to allow clients to group, filter and select connection string values based on structured metadata.
     * 
     */
    public Optional<Output<List<AutonomousDatabaseConnectionStringProfileArgs>>> profiles() {
        return Optional.ofNullable(this.profiles);
    }

    private AutonomousDatabaseConnectionStringArgs() {}

    private AutonomousDatabaseConnectionStringArgs(AutonomousDatabaseConnectionStringArgs $) {
        this.allConnectionStrings = $.allConnectionStrings;
        this.dedicated = $.dedicated;
        this.high = $.high;
        this.low = $.low;
        this.medium = $.medium;
        this.profiles = $.profiles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutonomousDatabaseConnectionStringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutonomousDatabaseConnectionStringArgs $;

        public Builder() {
            $ = new AutonomousDatabaseConnectionStringArgs();
        }

        public Builder(AutonomousDatabaseConnectionStringArgs defaults) {
            $ = new AutonomousDatabaseConnectionStringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allConnectionStrings Returns all connection strings that can be used to connect to the Autonomous Database. For more information, please see [Predefined Database Service Names for Autonomous Transaction Processing](https://docs.oracle.com/en/cloud/paas/atp-cloud/atpug/connect-predefined.html#GUID-9747539B-FD46-44F1-8FF8-F5AC650F15BE)
         * 
         * @return builder
         * 
         */
        public Builder allConnectionStrings(@Nullable Output<Map<String,Object>> allConnectionStrings) {
            $.allConnectionStrings = allConnectionStrings;
            return this;
        }

        /**
         * @param allConnectionStrings Returns all connection strings that can be used to connect to the Autonomous Database. For more information, please see [Predefined Database Service Names for Autonomous Transaction Processing](https://docs.oracle.com/en/cloud/paas/atp-cloud/atpug/connect-predefined.html#GUID-9747539B-FD46-44F1-8FF8-F5AC650F15BE)
         * 
         * @return builder
         * 
         */
        public Builder allConnectionStrings(Map<String,Object> allConnectionStrings) {
            return allConnectionStrings(Output.of(allConnectionStrings));
        }

        /**
         * @param dedicated The database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
         * 
         * @return builder
         * 
         */
        public Builder dedicated(@Nullable Output<String> dedicated) {
            $.dedicated = dedicated;
            return this;
        }

        /**
         * @param dedicated The database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
         * 
         * @return builder
         * 
         */
        public Builder dedicated(String dedicated) {
            return dedicated(Output.of(dedicated));
        }

        /**
         * @param high The High database service provides the highest level of resources to each SQL statement resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
         * 
         * @return builder
         * 
         */
        public Builder high(@Nullable Output<String> high) {
            $.high = high;
            return this;
        }

        /**
         * @param high The High database service provides the highest level of resources to each SQL statement resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
         * 
         * @return builder
         * 
         */
        public Builder high(String high) {
            return high(Output.of(high));
        }

        /**
         * @param low The Low database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
         * 
         * @return builder
         * 
         */
        public Builder low(@Nullable Output<String> low) {
            $.low = low;
            return this;
        }

        /**
         * @param low The Low database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
         * 
         * @return builder
         * 
         */
        public Builder low(String low) {
            return low(Output.of(low));
        }

        /**
         * @param medium The Medium database service provides a lower level of resources to each SQL statement potentially resulting a lower level of performance, but supports more concurrent SQL statements.
         * 
         * @return builder
         * 
         */
        public Builder medium(@Nullable Output<String> medium) {
            $.medium = medium;
            return this;
        }

        /**
         * @param medium The Medium database service provides a lower level of resources to each SQL statement potentially resulting a lower level of performance, but supports more concurrent SQL statements.
         * 
         * @return builder
         * 
         */
        public Builder medium(String medium) {
            return medium(Output.of(medium));
        }

        /**
         * @param profiles A list of connection string profiles to allow clients to group, filter and select connection string values based on structured metadata.
         * 
         * @return builder
         * 
         */
        public Builder profiles(@Nullable Output<List<AutonomousDatabaseConnectionStringProfileArgs>> profiles) {
            $.profiles = profiles;
            return this;
        }

        /**
         * @param profiles A list of connection string profiles to allow clients to group, filter and select connection string values based on structured metadata.
         * 
         * @return builder
         * 
         */
        public Builder profiles(List<AutonomousDatabaseConnectionStringProfileArgs> profiles) {
            return profiles(Output.of(profiles));
        }

        /**
         * @param profiles A list of connection string profiles to allow clients to group, filter and select connection string values based on structured metadata.
         * 
         * @return builder
         * 
         */
        public Builder profiles(AutonomousDatabaseConnectionStringProfileArgs... profiles) {
            return profiles(List.of(profiles));
        }

        public AutonomousDatabaseConnectionStringArgs build() {
            return $;
        }
    }

}
