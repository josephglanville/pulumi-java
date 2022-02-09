// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.OfficeDataConnectorDataTypesExchangeArgs;
import io.pulumi.azurenative.securityinsights.inputs.OfficeDataConnectorDataTypesSharePointArgs;
import io.pulumi.azurenative.securityinsights.inputs.OfficeDataConnectorDataTypesTeamsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OfficeDataConnectorDataTypesArgs extends io.pulumi.resources.ResourceArgs {

    public static final OfficeDataConnectorDataTypesArgs Empty = new OfficeDataConnectorDataTypesArgs();

    @InputImport(name="exchange")
    private final @Nullable Input<OfficeDataConnectorDataTypesExchangeArgs> exchange;

    public Input<OfficeDataConnectorDataTypesExchangeArgs> getExchange() {
        return this.exchange == null ? Input.empty() : this.exchange;
    }

    @InputImport(name="sharePoint")
    private final @Nullable Input<OfficeDataConnectorDataTypesSharePointArgs> sharePoint;

    public Input<OfficeDataConnectorDataTypesSharePointArgs> getSharePoint() {
        return this.sharePoint == null ? Input.empty() : this.sharePoint;
    }

    @InputImport(name="teams")
    private final @Nullable Input<OfficeDataConnectorDataTypesTeamsArgs> teams;

    public Input<OfficeDataConnectorDataTypesTeamsArgs> getTeams() {
        return this.teams == null ? Input.empty() : this.teams;
    }

    public OfficeDataConnectorDataTypesArgs(
        @Nullable Input<OfficeDataConnectorDataTypesExchangeArgs> exchange,
        @Nullable Input<OfficeDataConnectorDataTypesSharePointArgs> sharePoint,
        @Nullable Input<OfficeDataConnectorDataTypesTeamsArgs> teams) {
        this.exchange = exchange;
        this.sharePoint = sharePoint;
        this.teams = teams;
    }

    private OfficeDataConnectorDataTypesArgs() {
        this.exchange = Input.empty();
        this.sharePoint = Input.empty();
        this.teams = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OfficeDataConnectorDataTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OfficeDataConnectorDataTypesExchangeArgs> exchange;
        private @Nullable Input<OfficeDataConnectorDataTypesSharePointArgs> sharePoint;
        private @Nullable Input<OfficeDataConnectorDataTypesTeamsArgs> teams;

        public Builder() {
    	      // Empty
        }

        public Builder(OfficeDataConnectorDataTypesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exchange = defaults.exchange;
    	      this.sharePoint = defaults.sharePoint;
    	      this.teams = defaults.teams;
        }

        public Builder setExchange(@Nullable Input<OfficeDataConnectorDataTypesExchangeArgs> exchange) {
            this.exchange = exchange;
            return this;
        }

        public Builder setExchange(@Nullable OfficeDataConnectorDataTypesExchangeArgs exchange) {
            this.exchange = Input.ofNullable(exchange);
            return this;
        }

        public Builder setSharePoint(@Nullable Input<OfficeDataConnectorDataTypesSharePointArgs> sharePoint) {
            this.sharePoint = sharePoint;
            return this;
        }

        public Builder setSharePoint(@Nullable OfficeDataConnectorDataTypesSharePointArgs sharePoint) {
            this.sharePoint = Input.ofNullable(sharePoint);
            return this;
        }

        public Builder setTeams(@Nullable Input<OfficeDataConnectorDataTypesTeamsArgs> teams) {
            this.teams = teams;
            return this;
        }

        public Builder setTeams(@Nullable OfficeDataConnectorDataTypesTeamsArgs teams) {
            this.teams = Input.ofNullable(teams);
            return this;
        }

        public OfficeDataConnectorDataTypesArgs build() {
            return new OfficeDataConnectorDataTypesArgs(exchange, sharePoint, teams);
        }
    }
}
