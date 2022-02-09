// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.OfficeDataConnectorDataTypesResponseExchange;
import io.pulumi.azurenative.securityinsights.inputs.OfficeDataConnectorDataTypesResponseSharePoint;
import io.pulumi.azurenative.securityinsights.inputs.OfficeDataConnectorDataTypesResponseTeams;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OfficeDataConnectorDataTypesResponse extends io.pulumi.resources.InvokeArgs {

    public static final OfficeDataConnectorDataTypesResponse Empty = new OfficeDataConnectorDataTypesResponse();

    @InputImport(name="exchange")
    private final @Nullable OfficeDataConnectorDataTypesResponseExchange exchange;

    public Optional<OfficeDataConnectorDataTypesResponseExchange> getExchange() {
        return this.exchange == null ? Optional.empty() : Optional.ofNullable(this.exchange);
    }

    @InputImport(name="sharePoint")
    private final @Nullable OfficeDataConnectorDataTypesResponseSharePoint sharePoint;

    public Optional<OfficeDataConnectorDataTypesResponseSharePoint> getSharePoint() {
        return this.sharePoint == null ? Optional.empty() : Optional.ofNullable(this.sharePoint);
    }

    @InputImport(name="teams")
    private final @Nullable OfficeDataConnectorDataTypesResponseTeams teams;

    public Optional<OfficeDataConnectorDataTypesResponseTeams> getTeams() {
        return this.teams == null ? Optional.empty() : Optional.ofNullable(this.teams);
    }

    public OfficeDataConnectorDataTypesResponse(
        @Nullable OfficeDataConnectorDataTypesResponseExchange exchange,
        @Nullable OfficeDataConnectorDataTypesResponseSharePoint sharePoint,
        @Nullable OfficeDataConnectorDataTypesResponseTeams teams) {
        this.exchange = exchange;
        this.sharePoint = sharePoint;
        this.teams = teams;
    }

    private OfficeDataConnectorDataTypesResponse() {
        this.exchange = null;
        this.sharePoint = null;
        this.teams = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OfficeDataConnectorDataTypesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OfficeDataConnectorDataTypesResponseExchange exchange;
        private @Nullable OfficeDataConnectorDataTypesResponseSharePoint sharePoint;
        private @Nullable OfficeDataConnectorDataTypesResponseTeams teams;

        public Builder() {
    	      // Empty
        }

        public Builder(OfficeDataConnectorDataTypesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exchange = defaults.exchange;
    	      this.sharePoint = defaults.sharePoint;
    	      this.teams = defaults.teams;
        }

        public Builder setExchange(@Nullable OfficeDataConnectorDataTypesResponseExchange exchange) {
            this.exchange = exchange;
            return this;
        }

        public Builder setSharePoint(@Nullable OfficeDataConnectorDataTypesResponseSharePoint sharePoint) {
            this.sharePoint = sharePoint;
            return this;
        }

        public Builder setTeams(@Nullable OfficeDataConnectorDataTypesResponseTeams teams) {
            this.teams = teams;
            return this;
        }

        public OfficeDataConnectorDataTypesResponse build() {
            return new OfficeDataConnectorDataTypesResponse(exchange, sharePoint, teams);
        }
    }
}
