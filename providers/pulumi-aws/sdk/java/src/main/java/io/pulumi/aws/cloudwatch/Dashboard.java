// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.DashboardArgs;
import io.pulumi.aws.cloudwatch.inputs.DashboardState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch Dashboard resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CloudWatch dashboards can be imported using the `dashboard_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/dashboard:Dashboard sample <dashboard_name>
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/dashboard:Dashboard")
public class Dashboard extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the dashboard.
     * 
     */
    @Export(name="dashboardArn", type=String.class, parameters={})
    private Output<String> dashboardArn;

    /**
     * @return The Amazon Resource Name (ARN) of the dashboard.
     * 
     */
    public Output<String> getDashboardArn() {
        return this.dashboardArn;
    }
    /**
     * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
     * 
     */
    @Export(name="dashboardBody", type=String.class, parameters={})
    private Output<String> dashboardBody;

    /**
     * @return The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
     * 
     */
    public Output<String> getDashboardBody() {
        return this.dashboardBody;
    }
    /**
     * The name of the dashboard.
     * 
     */
    @Export(name="dashboardName", type=String.class, parameters={})
    private Output<String> dashboardName;

    /**
     * @return The name of the dashboard.
     * 
     */
    public Output<String> getDashboardName() {
        return this.dashboardName;
    }

    public interface BuilderApplicator {
        public void apply(DashboardArgs.Builder a);
    }
    private static io.pulumi.aws.cloudwatch.DashboardArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudwatch.DashboardArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Dashboard(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dashboard(String name) {
        this(name, DashboardArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dashboard(String name, DashboardArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dashboard(String name, DashboardArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/dashboard:Dashboard", name, args == null ? DashboardArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Dashboard(String name, Output<String> id, @Nullable DashboardState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/dashboard:Dashboard", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Dashboard get(String name, Output<String> id, @Nullable DashboardState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Dashboard(name, id, state, options);
    }
}
