// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.guardduty.DetectorArgs;
import io.pulumi.aws.guardduty.inputs.DetectorState;
import io.pulumi.aws.guardduty.outputs.DetectorDatasources;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a GuardDuty detector.
 * 
 * > **NOTE:** Deleting this resource is equivalent to "disabling" GuardDuty for an AWS region, which removes all existing findings. You can set the `enable` attribute to `false` to instead "suspend" monitoring and feedback reporting while keeping existing data. See the [Suspending or Disabling Amazon GuardDuty documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_suspend-disable.html) for more information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GuardDuty detectors can be imported using the detector ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:guardduty/detector:Detector MyDetector 00b00fd5aecc0ab60a708659477e9617
 * ```
 * 
 */
@ResourceType(type="aws:guardduty/detector:Detector")
public class Detector extends io.pulumi.resources.CustomResource {
    /**
     * The AWS account ID of the GuardDuty detector
     * 
     */
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The AWS account ID of the GuardDuty detector
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * Amazon Resource Name (ARN) of the GuardDuty detector
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the GuardDuty detector
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Describes which data sources will be enabled for the detector. See Data Sources below for more details.
     * 
     */
    @OutputExport(name="datasources", type=DetectorDatasources.class, parameters={})
    private Output<DetectorDatasources> datasources;

    /**
     * @return Describes which data sources will be enabled for the detector. See Data Sources below for more details.
     * 
     */
    public Output<DetectorDatasources> getDatasources() {
        return this.datasources;
    }
    /**
     * If true, enables [S3 Protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3_detection.html). Defaults to `true`.
     * 
     */
    @OutputExport(name="enable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enable;

    /**
     * @return If true, enables [S3 Protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3_detection.html). Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnable() {
        return this.enable;
    }
    /**
     * Specifies the frequency of notifications sent for subsequent finding occurrences. If the detector is a GuardDuty member account, the value is determined by the GuardDuty primary account and cannot be modified, otherwise defaults to `SIX_HOURS`. For standalone and GuardDuty primary accounts, it must be configured in this provider to enable drift detection. Valid values for standalone and primary accounts: `FIFTEEN_MINUTES`, `ONE_HOUR`, `SIX_HOURS`. See [AWS Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_findings_cloudwatch.html#guardduty_findings_cloudwatch_notification_frequency) for more information.
     * 
     */
    @OutputExport(name="findingPublishingFrequency", type=String.class, parameters={})
    private Output<String> findingPublishingFrequency;

    /**
     * @return Specifies the frequency of notifications sent for subsequent finding occurrences. If the detector is a GuardDuty member account, the value is determined by the GuardDuty primary account and cannot be modified, otherwise defaults to `SIX_HOURS`. For standalone and GuardDuty primary accounts, it must be configured in this provider to enable drift detection. Valid values for standalone and primary accounts: `FIFTEEN_MINUTES`, `ONE_HOUR`, `SIX_HOURS`. See [AWS Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_findings_cloudwatch.html#guardduty_findings_cloudwatch_notification_frequency) for more information.
     * 
     */
    public Output<String> getFindingPublishingFrequency() {
        return this.findingPublishingFrequency;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable DetectorArgs.Builder a);
    }
    private static io.pulumi.aws.guardduty.DetectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.guardduty.DetectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Detector(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Detector(String name) {
        this(name, DetectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Detector(String name, @Nullable DetectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Detector(String name, @Nullable DetectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/detector:Detector", name, args == null ? DetectorArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Detector(String name, Output<String> id, @Nullable DetectorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/detector:Detector", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Detector get(String name, Output<String> id, @Nullable DetectorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Detector(name, id, state, options);
    }
}
