// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1alpha1.DatacenterConnectorArgs;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.StatusResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new DatacenterConnector in a given Source.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:vmmigration/v1alpha1:DatacenterConnector")
public class DatacenterConnector extends io.pulumi.resources.CustomResource {
    /**
     * The communication channel between the datacenter connector and GCP.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The communication channel between the datacenter connector and GCP.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * The time the connector was created (as an API call, not when it was actually installed).
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the connector was created (as an API call, not when it was actually installed).
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Provides details on the state of the Datacenter Connector in case of an error.
     * 
     */
    @Export(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return Provides details on the state of the Datacenter Connector in case of an error.
     * 
     */
    public Output<StatusResponse> getError() {
        return this.error;
    }
    /**
     * The connector's name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The connector's name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Immutable. A unique key for this connector. This key is internal to the OVA connector and is supplied with its creation during the registration process and can not be modified.
     * 
     */
    @Export(name="registrationId", type=String.class, parameters={})
    private Output<String> registrationId;

    /**
     * @return Immutable. A unique key for this connector. This key is internal to the OVA connector and is supplied with its creation during the registration process and can not be modified.
     * 
     */
    public Output<String> getRegistrationId() {
        return this.registrationId;
    }
    /**
     * The service account to use in the connector when communicating with the cloud.
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return The service account to use in the connector when communicating with the cloud.
     * 
     */
    public Output<String> getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * State of the DatacenterConnector, as determined by the health checks.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the DatacenterConnector, as determined by the health checks.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The time the state was last set.
     * 
     */
    @Export(name="stateTime", type=String.class, parameters={})
    private Output<String> stateTime;

    /**
     * @return The time the state was last set.
     * 
     */
    public Output<String> getStateTime() {
        return this.stateTime;
    }
    /**
     * The last time the connector was updated with an API call.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last time the connector was updated with an API call.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * The version running in the DatacenterConnector. This is supplied by the OVA connector during the registration process and can not be modified.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version running in the DatacenterConnector. This is supplied by the OVA connector during the registration process and can not be modified.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatacenterConnector(String name) {
        this(name, DatacenterConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatacenterConnector(String name, DatacenterConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatacenterConnector(String name, DatacenterConnectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:DatacenterConnector", name, args == null ? DatacenterConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatacenterConnector(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:DatacenterConnector", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DatacenterConnector get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DatacenterConnector(name, id, options);
    }
}
