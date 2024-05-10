// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.trafficmanagement;

import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.trafficmanagement.inputs.GetGtmDefaultDatacenterArgs;
import com.pulumi.akamai.trafficmanagement.inputs.GetGtmDefaultDatacenterPlainArgs;
import com.pulumi.akamai.trafficmanagement.outputs.GetGtmDefaultDatacenterResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class TrafficmanagementFunctions {
    /**
     * 
     * @deprecated
     * akamai.trafficmanagement/getgtmdefaultdatacenter.getGtmDefaultDatacenter has been deprecated in favor of akamai.index/getgtmdefaultdatacenter.getGtmDefaultDatacenter
     * 
     */
    @Deprecated /* akamai.trafficmanagement/getgtmdefaultdatacenter.getGtmDefaultDatacenter has been deprecated in favor of akamai.index/getgtmdefaultdatacenter.getGtmDefaultDatacenter */
    public static Output<GetGtmDefaultDatacenterResult> getGtmDefaultDatacenter(GetGtmDefaultDatacenterArgs args) {
        return getGtmDefaultDatacenter(args, InvokeOptions.Empty);
    }
    /**
     * 
     * @deprecated
     * akamai.trafficmanagement/getgtmdefaultdatacenter.getGtmDefaultDatacenter has been deprecated in favor of akamai.index/getgtmdefaultdatacenter.getGtmDefaultDatacenter
     * 
     */
    @Deprecated /* akamai.trafficmanagement/getgtmdefaultdatacenter.getGtmDefaultDatacenter has been deprecated in favor of akamai.index/getgtmdefaultdatacenter.getGtmDefaultDatacenter */
    public static CompletableFuture<GetGtmDefaultDatacenterResult> getGtmDefaultDatacenterPlain(GetGtmDefaultDatacenterPlainArgs args) {
        return getGtmDefaultDatacenterPlain(args, InvokeOptions.Empty);
    }
    /**
     * 
     * @deprecated
     * akamai.trafficmanagement/getgtmdefaultdatacenter.getGtmDefaultDatacenter has been deprecated in favor of akamai.index/getgtmdefaultdatacenter.getGtmDefaultDatacenter
     * 
     */
    @Deprecated /* akamai.trafficmanagement/getgtmdefaultdatacenter.getGtmDefaultDatacenter has been deprecated in favor of akamai.index/getgtmdefaultdatacenter.getGtmDefaultDatacenter */
    public static Output<GetGtmDefaultDatacenterResult> getGtmDefaultDatacenter(GetGtmDefaultDatacenterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("akamai:trafficmanagement/getGtmDefaultDatacenter:getGtmDefaultDatacenter", TypeShape.of(GetGtmDefaultDatacenterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * 
     * @deprecated
     * akamai.trafficmanagement/getgtmdefaultdatacenter.getGtmDefaultDatacenter has been deprecated in favor of akamai.index/getgtmdefaultdatacenter.getGtmDefaultDatacenter
     * 
     */
    @Deprecated /* akamai.trafficmanagement/getgtmdefaultdatacenter.getGtmDefaultDatacenter has been deprecated in favor of akamai.index/getgtmdefaultdatacenter.getGtmDefaultDatacenter */
    public static CompletableFuture<GetGtmDefaultDatacenterResult> getGtmDefaultDatacenterPlain(GetGtmDefaultDatacenterPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("akamai:trafficmanagement/getGtmDefaultDatacenter:getGtmDefaultDatacenter", TypeShape.of(GetGtmDefaultDatacenterResult.class), args, Utilities.withVersion(options));
    }
}
