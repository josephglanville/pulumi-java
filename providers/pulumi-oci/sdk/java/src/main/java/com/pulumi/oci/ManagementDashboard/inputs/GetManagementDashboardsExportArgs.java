// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ManagementDashboard.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagementDashboardsExportArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagementDashboardsExportArgs Empty = new GetManagementDashboardsExportArgs();

    /**
     * List of dashboardIds in plain text. The syntax is &#39;{&#34;dashboardIds&#34;:[&#34;dashboardId1&#34;, &#34;dashboardId2&#34;, ...]}&#39;. Escaping is needed when using in Oracle Cloud Infrastructure CLI. For example, &#34;{\&#34;dashboardIds\&#34;:[\&#34;ocid1.managementdashboard.oc1..dashboardId1\&#34;]}&#34; .
     * 
     */
    @Import(name="exportDashboardId", required=true)
    private String exportDashboardId;

    /**
     * @return List of dashboardIds in plain text. The syntax is &#39;{&#34;dashboardIds&#34;:[&#34;dashboardId1&#34;, &#34;dashboardId2&#34;, ...]}&#39;. Escaping is needed when using in Oracle Cloud Infrastructure CLI. For example, &#34;{\&#34;dashboardIds\&#34;:[\&#34;ocid1.managementdashboard.oc1..dashboardId1\&#34;]}&#34; .
     * 
     */
    public String exportDashboardId() {
        return this.exportDashboardId;
    }

    private GetManagementDashboardsExportArgs() {}

    private GetManagementDashboardsExportArgs(GetManagementDashboardsExportArgs $) {
        this.exportDashboardId = $.exportDashboardId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagementDashboardsExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagementDashboardsExportArgs $;

        public Builder() {
            $ = new GetManagementDashboardsExportArgs();
        }

        public Builder(GetManagementDashboardsExportArgs defaults) {
            $ = new GetManagementDashboardsExportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exportDashboardId List of dashboardIds in plain text. The syntax is &#39;{&#34;dashboardIds&#34;:[&#34;dashboardId1&#34;, &#34;dashboardId2&#34;, ...]}&#39;. Escaping is needed when using in Oracle Cloud Infrastructure CLI. For example, &#34;{\&#34;dashboardIds\&#34;:[\&#34;ocid1.managementdashboard.oc1..dashboardId1\&#34;]}&#34; .
         * 
         * @return builder
         * 
         */
        public Builder exportDashboardId(String exportDashboardId) {
            $.exportDashboardId = exportDashboardId;
            return this;
        }

        public GetManagementDashboardsExportArgs build() {
            $.exportDashboardId = Objects.requireNonNull($.exportDashboardId, "expected parameter 'exportDashboardId' to be non-null");
            return $;
        }
    }

}
