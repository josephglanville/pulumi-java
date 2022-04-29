// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApmSynthetics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMonitorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMonitorArgs Empty = new GetMonitorArgs();

    /**
     * The APM domain ID the request is intended for.
     * 
     */
    @Import(name="apmDomainId", required=true)
    private String apmDomainId;

    /**
     * @return The APM domain ID the request is intended for.
     * 
     */
    public String apmDomainId() {
        return this.apmDomainId;
    }

    /**
     * The OCID of the monitor.
     * 
     */
    @Import(name="monitorId", required=true)
    private String monitorId;

    /**
     * @return The OCID of the monitor.
     * 
     */
    public String monitorId() {
        return this.monitorId;
    }

    private GetMonitorArgs() {}

    private GetMonitorArgs(GetMonitorArgs $) {
        this.apmDomainId = $.apmDomainId;
        this.monitorId = $.monitorId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMonitorArgs $;

        public Builder() {
            $ = new GetMonitorArgs();
        }

        public Builder(GetMonitorArgs defaults) {
            $ = new GetMonitorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apmDomainId The APM domain ID the request is intended for.
         * 
         * @return builder
         * 
         */
        public Builder apmDomainId(String apmDomainId) {
            $.apmDomainId = apmDomainId;
            return this;
        }

        /**
         * @param monitorId The OCID of the monitor.
         * 
         * @return builder
         * 
         */
        public Builder monitorId(String monitorId) {
            $.monitorId = monitorId;
            return this;
        }

        public GetMonitorArgs build() {
            $.apmDomainId = Objects.requireNonNull($.apmDomainId, "expected parameter 'apmDomainId' to be non-null");
            $.monitorId = Objects.requireNonNull($.monitorId, "expected parameter 'monitorId' to be non-null");
            return $;
        }
    }

}
