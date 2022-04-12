// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.monitoring.inputs.GetAppEngineServiceArgs;
import io.pulumi.gcp.monitoring.inputs.GetClusterIstioServiceArgs;
import io.pulumi.gcp.monitoring.inputs.GetIstioCanonicalServiceArgs;
import io.pulumi.gcp.monitoring.inputs.GetMeshIstioServiceArgs;
import io.pulumi.gcp.monitoring.inputs.GetNotificationChannelArgs;
import io.pulumi.gcp.monitoring.inputs.GetSecretVersionArgs;
import io.pulumi.gcp.monitoring.outputs.GetAppEngineServiceResult;
import io.pulumi.gcp.monitoring.outputs.GetClusterIstioServiceResult;
import io.pulumi.gcp.monitoring.outputs.GetIstioCanonicalServiceResult;
import io.pulumi.gcp.monitoring.outputs.GetMeshIstioServiceResult;
import io.pulumi.gcp.monitoring.outputs.GetNotificationChannelResult;
import io.pulumi.gcp.monitoring.outputs.GetSecretVersionResult;
import io.pulumi.gcp.monitoring.outputs.GetUptimeCheckIPsResult;
import io.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class MonitoringFunctions {
    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     * generic service are accessible. A service is some discrete, autonomous, and
     * network-accessible unit, designed to solve an individual concern
     * 
     * An App Engine monitoring service is automatically created by GCP to monitor
     * App Engine services.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     * * How-to Guides
     *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAppEngineServiceResult> getAppEngineService(GetAppEngineServiceArgs args) {
        return getAppEngineService(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAppEngineServiceResult> getAppEngineService(GetAppEngineServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:monitoring/getAppEngineService:getAppEngineService", TypeShape.of(GetAppEngineServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     * generic service are accessible. A service is some discrete, autonomous, and
     * network-accessible unit, designed to solve an individual concern
     * 
     * An Cluster Istio monitoring service is automatically created by GCP to monitor
     * Cluster Istio services.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     * * How-to Guides
     *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetClusterIstioServiceResult> getClusterIstioService(GetClusterIstioServiceArgs args) {
        return getClusterIstioService(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClusterIstioServiceResult> getClusterIstioService(GetClusterIstioServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:monitoring/getClusterIstioService:getClusterIstioService", TypeShape.of(GetClusterIstioServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     * generic service are accessible. A service is some discrete, autonomous, and
     * network-accessible unit, designed to solve an individual concern
     * 
     * A monitoring Istio Canonical Service is automatically created by GCP to monitor
     * Istio Canonical Services.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     * * How-to Guides
     *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetIstioCanonicalServiceResult> getIstioCanonicalService(GetIstioCanonicalServiceArgs args) {
        return getIstioCanonicalService(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIstioCanonicalServiceResult> getIstioCanonicalService(GetIstioCanonicalServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:monitoring/getIstioCanonicalService:getIstioCanonicalService", TypeShape.of(GetIstioCanonicalServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Monitoring Service is the root resource under which operational aspects of a
     * generic service are accessible. A service is some discrete, autonomous, and
     * network-accessible unit, designed to solve an individual concern
     * 
     * An Mesh Istio monitoring service is automatically created by GCP to monitor
     * Mesh Istio services.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
     * * How-to Guides
     *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMeshIstioServiceResult> getMeshIstioService(GetMeshIstioServiceArgs args) {
        return getMeshIstioService(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetMeshIstioServiceResult> getMeshIstioService(GetMeshIstioServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:monitoring/getMeshIstioService:getMeshIstioService", TypeShape.of(GetMeshIstioServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A NotificationChannel is a medium through which an alert is delivered
     * when a policy violation is detected. Examples of channels include email, SMS,
     * and third-party messaging applications. Fields containing sensitive information
     * like authentication tokens or contact info are only partially populated on retrieval.
     * 
     * To get more information about NotificationChannel, see:
     * 
     * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
     * * How-to Guides
     *     * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
     *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNotificationChannelResult> getNotificationChannel() {
        return getNotificationChannel(GetNotificationChannelArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNotificationChannelResult> getNotificationChannel(GetNotificationChannelArgs args) {
        return getNotificationChannel(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNotificationChannelResult> getNotificationChannel(GetNotificationChannelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:monitoring/getNotificationChannel:getNotificationChannel", TypeShape.of(GetNotificationChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * 
     * @Deprecated
     * gcp.monitoring.getSecretVersion has been deprecated in favor of gcp.secretmanager.getSecretVersion
     * 
     */
    @Deprecated /* gcp.monitoring.getSecretVersion has been deprecated in favor of gcp.secretmanager.getSecretVersion */
    public static CompletableFuture<GetSecretVersionResult> getSecretVersion(GetSecretVersionArgs args) {
        return getSecretVersion(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecretVersionResult> getSecretVersion(GetSecretVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:monitoring/getSecretVersion:getSecretVersion", TypeShape.of(GetSecretVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the list of IP addresses that checkers run from. For more information see
     * the [official documentation](https://cloud.google.com/monitoring/uptime-checks#get-ips).
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUptimeCheckIPsResult> getUptimeCheckIPs() {
        return getUptimeCheckIPs(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUptimeCheckIPsResult> getUptimeCheckIPs(InvokeArgs args) {
        return getUptimeCheckIPs(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUptimeCheckIPsResult> getUptimeCheckIPs(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:monitoring/getUptimeCheckIPs:getUptimeCheckIPs", TypeShape.of(GetUptimeCheckIPsResult.class), args, Utilities.withVersion(options));
    }
}
