// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkConfigurationResponse Empty = new VirtualNetworkConfigurationResponse();

    @InputImport(name="subnetResourceId")
    private final @Nullable String subnetResourceId;

    public Optional<String> getSubnetResourceId() {
        return this.subnetResourceId == null ? Optional.empty() : Optional.ofNullable(this.subnetResourceId);
    }

    @InputImport(name="subnetname", required=true)
    private final String subnetname;

    public String getSubnetname() {
        return this.subnetname;
    }

    @InputImport(name="vnetid", required=true)
    private final String vnetid;

    public String getVnetid() {
        return this.vnetid;
    }

    public VirtualNetworkConfigurationResponse(
        @Nullable String subnetResourceId,
        String subnetname,
        String vnetid) {
        this.subnetResourceId = subnetResourceId;
        this.subnetname = Objects.requireNonNull(subnetname, "expected parameter 'subnetname' to be non-null");
        this.vnetid = Objects.requireNonNull(vnetid, "expected parameter 'vnetid' to be non-null");
    }

    private VirtualNetworkConfigurationResponse() {
        this.subnetResourceId = null;
        this.subnetname = null;
        this.vnetid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetResourceId;
        private String subnetname;
        private String vnetid;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetResourceId = defaults.subnetResourceId;
    	      this.subnetname = defaults.subnetname;
    	      this.vnetid = defaults.vnetid;
        }

        public Builder setSubnetResourceId(@Nullable String subnetResourceId) {
            this.subnetResourceId = subnetResourceId;
            return this;
        }

        public Builder setSubnetname(String subnetname) {
            this.subnetname = Objects.requireNonNull(subnetname);
            return this;
        }

        public Builder setVnetid(String vnetid) {
            this.vnetid = Objects.requireNonNull(vnetid);
            return this;
        }

        public VirtualNetworkConfigurationResponse build() {
            return new VirtualNetworkConfigurationResponse(subnetResourceId, subnetname, vnetid);
        }
    }
}
