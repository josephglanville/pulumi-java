// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MysqlDbSystemMaintenanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MysqlDbSystemMaintenanceArgs Empty = new MysqlDbSystemMaintenanceArgs();

    /**
     * (Updatable) The start of the 2 hour maintenance window.
     * 
     */
    @Import(name="windowStartTime", required=true)
    private Output<String> windowStartTime;

    /**
     * @return (Updatable) The start of the 2 hour maintenance window.
     * 
     */
    public Output<String> windowStartTime() {
        return this.windowStartTime;
    }

    private MysqlDbSystemMaintenanceArgs() {}

    private MysqlDbSystemMaintenanceArgs(MysqlDbSystemMaintenanceArgs $) {
        this.windowStartTime = $.windowStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlDbSystemMaintenanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlDbSystemMaintenanceArgs $;

        public Builder() {
            $ = new MysqlDbSystemMaintenanceArgs();
        }

        public Builder(MysqlDbSystemMaintenanceArgs defaults) {
            $ = new MysqlDbSystemMaintenanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param windowStartTime (Updatable) The start of the 2 hour maintenance window.
         * 
         * @return builder
         * 
         */
        public Builder windowStartTime(Output<String> windowStartTime) {
            $.windowStartTime = windowStartTime;
            return this;
        }

        /**
         * @param windowStartTime (Updatable) The start of the 2 hour maintenance window.
         * 
         * @return builder
         * 
         */
        public Builder windowStartTime(String windowStartTime) {
            return windowStartTime(Output.of(windowStartTime));
        }

        public MysqlDbSystemMaintenanceArgs build() {
            $.windowStartTime = Objects.requireNonNull($.windowStartTime, "expected parameter 'windowStartTime' to be non-null");
            return $;
        }
    }

}
