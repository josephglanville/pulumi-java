// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LogAnalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLogAnalyticsLogGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogAnalyticsLogGroupArgs Empty = new GetLogAnalyticsLogGroupArgs();

    /**
     * unique logAnalytics log group identifier
     * 
     */
    @Import(name="logAnalyticsLogGroupId", required=true)
    private String logAnalyticsLogGroupId;

    /**
     * @return unique logAnalytics log group identifier
     * 
     */
    public String logAnalyticsLogGroupId() {
        return this.logAnalyticsLogGroupId;
    }

    /**
     * The Logging Analytics namespace used for the request.
     * 
     */
    @Import(name="namespace", required=true)
    private String namespace;

    /**
     * @return The Logging Analytics namespace used for the request.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    private GetLogAnalyticsLogGroupArgs() {}

    private GetLogAnalyticsLogGroupArgs(GetLogAnalyticsLogGroupArgs $) {
        this.logAnalyticsLogGroupId = $.logAnalyticsLogGroupId;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogAnalyticsLogGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogAnalyticsLogGroupArgs $;

        public Builder() {
            $ = new GetLogAnalyticsLogGroupArgs();
        }

        public Builder(GetLogAnalyticsLogGroupArgs defaults) {
            $ = new GetLogAnalyticsLogGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logAnalyticsLogGroupId unique logAnalytics log group identifier
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsLogGroupId(String logAnalyticsLogGroupId) {
            $.logAnalyticsLogGroupId = logAnalyticsLogGroupId;
            return this;
        }

        /**
         * @param namespace The Logging Analytics namespace used for the request.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        public GetLogAnalyticsLogGroupArgs build() {
            $.logAnalyticsLogGroupId = Objects.requireNonNull($.logAnalyticsLogGroupId, "expected parameter 'logAnalyticsLogGroupId' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
