// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionAdvancedImMatch;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionBucket;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionCacheability;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionChinaCdnRegion;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionClientIp;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionClientIpVersion;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionCloudletsOrigin;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionContentDeliveryNetwork;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionContentType;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionDeviceCharacteristic;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionEcmdAuthGroups;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionEcmdAuthScheme;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionEcmdIsAuthenticated;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionEcmdUsername;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionEdgeWorkersFailure;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionFileExtension;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionFilename;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionHostname;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionMatchAdvanced;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionMatchCpCode;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionMatchResponseCode;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionMatchVariable;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionMetadataStage;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionOriginTimeout;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionPath;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionQueryStringParameter;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionRandom;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionRecoveryConfig;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionRegularExpression;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionRequestCookie;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionRequestMethod;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionRequestProtocol;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionRequestType;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionResponseHeader;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionServerLocation;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionTime;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionUserAgent;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionUserLocation;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionUserNetwork;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionVariableError;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionVirtualWaitingRoomRequest;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530CriterionVisitorPrioritizationRequest;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530Criterion extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530Criterion Empty = new GetPropertyRulesBuilderRulesV20230530Criterion();

    @Import(name="advancedImMatch")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionAdvancedImMatch advancedImMatch;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionAdvancedImMatch> advancedImMatch() {
        return Optional.ofNullable(this.advancedImMatch);
    }

    @Import(name="bucket")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionBucket bucket;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionBucket> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    @Import(name="cacheability")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionCacheability cacheability;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionCacheability> cacheability() {
        return Optional.ofNullable(this.cacheability);
    }

    @Import(name="chinaCdnRegion")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionChinaCdnRegion chinaCdnRegion;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionChinaCdnRegion> chinaCdnRegion() {
        return Optional.ofNullable(this.chinaCdnRegion);
    }

    @Import(name="clientCertificate")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate clientCertificate;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate> clientCertificate() {
        return Optional.ofNullable(this.clientCertificate);
    }

    @Import(name="clientIp")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionClientIp clientIp;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionClientIp> clientIp() {
        return Optional.ofNullable(this.clientIp);
    }

    @Import(name="clientIpVersion")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionClientIpVersion clientIpVersion;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionClientIpVersion> clientIpVersion() {
        return Optional.ofNullable(this.clientIpVersion);
    }

    @Import(name="cloudletsOrigin")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionCloudletsOrigin cloudletsOrigin;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionCloudletsOrigin> cloudletsOrigin() {
        return Optional.ofNullable(this.cloudletsOrigin);
    }

    @Import(name="contentDeliveryNetwork")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionContentDeliveryNetwork contentDeliveryNetwork;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionContentDeliveryNetwork> contentDeliveryNetwork() {
        return Optional.ofNullable(this.contentDeliveryNetwork);
    }

    @Import(name="contentType")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionContentType contentType;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionContentType> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    @Import(name="deviceCharacteristic")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionDeviceCharacteristic deviceCharacteristic;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionDeviceCharacteristic> deviceCharacteristic() {
        return Optional.ofNullable(this.deviceCharacteristic);
    }

    @Import(name="ecmdAuthGroups")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionEcmdAuthGroups ecmdAuthGroups;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionEcmdAuthGroups> ecmdAuthGroups() {
        return Optional.ofNullable(this.ecmdAuthGroups);
    }

    @Import(name="ecmdAuthScheme")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionEcmdAuthScheme ecmdAuthScheme;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionEcmdAuthScheme> ecmdAuthScheme() {
        return Optional.ofNullable(this.ecmdAuthScheme);
    }

    @Import(name="ecmdIsAuthenticated")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionEcmdIsAuthenticated ecmdIsAuthenticated;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionEcmdIsAuthenticated> ecmdIsAuthenticated() {
        return Optional.ofNullable(this.ecmdIsAuthenticated);
    }

    @Import(name="ecmdUsername")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionEcmdUsername ecmdUsername;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionEcmdUsername> ecmdUsername() {
        return Optional.ofNullable(this.ecmdUsername);
    }

    @Import(name="edgeWorkersFailure")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionEdgeWorkersFailure edgeWorkersFailure;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionEdgeWorkersFailure> edgeWorkersFailure() {
        return Optional.ofNullable(this.edgeWorkersFailure);
    }

    @Import(name="fileExtension")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionFileExtension fileExtension;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionFileExtension> fileExtension() {
        return Optional.ofNullable(this.fileExtension);
    }

    @Import(name="filename")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionFilename filename;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionFilename> filename() {
        return Optional.ofNullable(this.filename);
    }

    @Import(name="hostname")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionHostname hostname;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionHostname> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    @Import(name="matchAdvanced")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionMatchAdvanced matchAdvanced;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionMatchAdvanced> matchAdvanced() {
        return Optional.ofNullable(this.matchAdvanced);
    }

    @Import(name="matchCpCode")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionMatchCpCode matchCpCode;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionMatchCpCode> matchCpCode() {
        return Optional.ofNullable(this.matchCpCode);
    }

    @Import(name="matchResponseCode")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionMatchResponseCode matchResponseCode;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionMatchResponseCode> matchResponseCode() {
        return Optional.ofNullable(this.matchResponseCode);
    }

    @Import(name="matchVariable")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionMatchVariable matchVariable;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionMatchVariable> matchVariable() {
        return Optional.ofNullable(this.matchVariable);
    }

    @Import(name="metadataStage")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionMetadataStage metadataStage;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionMetadataStage> metadataStage() {
        return Optional.ofNullable(this.metadataStage);
    }

    @Import(name="originTimeout")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionOriginTimeout originTimeout;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionOriginTimeout> originTimeout() {
        return Optional.ofNullable(this.originTimeout);
    }

    @Import(name="path")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionPath path;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionPath> path() {
        return Optional.ofNullable(this.path);
    }

    @Import(name="queryStringParameter")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionQueryStringParameter queryStringParameter;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionQueryStringParameter> queryStringParameter() {
        return Optional.ofNullable(this.queryStringParameter);
    }

    @Import(name="random")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionRandom random;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionRandom> random() {
        return Optional.ofNullable(this.random);
    }

    @Import(name="recoveryConfig")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionRecoveryConfig recoveryConfig;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionRecoveryConfig> recoveryConfig() {
        return Optional.ofNullable(this.recoveryConfig);
    }

    @Import(name="regularExpression")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionRegularExpression regularExpression;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionRegularExpression> regularExpression() {
        return Optional.ofNullable(this.regularExpression);
    }

    @Import(name="requestCookie")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionRequestCookie requestCookie;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionRequestCookie> requestCookie() {
        return Optional.ofNullable(this.requestCookie);
    }

    @Import(name="requestHeader")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader requestHeader;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader> requestHeader() {
        return Optional.ofNullable(this.requestHeader);
    }

    @Import(name="requestMethod")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionRequestMethod requestMethod;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionRequestMethod> requestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }

    @Import(name="requestProtocol")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionRequestProtocol requestProtocol;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionRequestProtocol> requestProtocol() {
        return Optional.ofNullable(this.requestProtocol);
    }

    @Import(name="requestType")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionRequestType requestType;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionRequestType> requestType() {
        return Optional.ofNullable(this.requestType);
    }

    @Import(name="responseHeader")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionResponseHeader responseHeader;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionResponseHeader> responseHeader() {
        return Optional.ofNullable(this.responseHeader);
    }

    @Import(name="serverLocation")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionServerLocation serverLocation;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionServerLocation> serverLocation() {
        return Optional.ofNullable(this.serverLocation);
    }

    @Import(name="time")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionTime time;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionTime> time() {
        return Optional.ofNullable(this.time);
    }

    @Import(name="tokenAuthorization")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization tokenAuthorization;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization> tokenAuthorization() {
        return Optional.ofNullable(this.tokenAuthorization);
    }

    @Import(name="userAgent")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionUserAgent userAgent;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionUserAgent> userAgent() {
        return Optional.ofNullable(this.userAgent);
    }

    @Import(name="userLocation")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionUserLocation userLocation;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionUserLocation> userLocation() {
        return Optional.ofNullable(this.userLocation);
    }

    @Import(name="userNetwork")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionUserNetwork userNetwork;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionUserNetwork> userNetwork() {
        return Optional.ofNullable(this.userNetwork);
    }

    @Import(name="variableError")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionVariableError variableError;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionVariableError> variableError() {
        return Optional.ofNullable(this.variableError);
    }

    @Import(name="virtualWaitingRoomRequest")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionVirtualWaitingRoomRequest virtualWaitingRoomRequest;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionVirtualWaitingRoomRequest> virtualWaitingRoomRequest() {
        return Optional.ofNullable(this.virtualWaitingRoomRequest);
    }

    @Import(name="visitorPrioritizationRequest")
    private @Nullable GetPropertyRulesBuilderRulesV20230530CriterionVisitorPrioritizationRequest visitorPrioritizationRequest;

    public Optional<GetPropertyRulesBuilderRulesV20230530CriterionVisitorPrioritizationRequest> visitorPrioritizationRequest() {
        return Optional.ofNullable(this.visitorPrioritizationRequest);
    }

    private GetPropertyRulesBuilderRulesV20230530Criterion() {}

    private GetPropertyRulesBuilderRulesV20230530Criterion(GetPropertyRulesBuilderRulesV20230530Criterion $) {
        this.advancedImMatch = $.advancedImMatch;
        this.bucket = $.bucket;
        this.cacheability = $.cacheability;
        this.chinaCdnRegion = $.chinaCdnRegion;
        this.clientCertificate = $.clientCertificate;
        this.clientIp = $.clientIp;
        this.clientIpVersion = $.clientIpVersion;
        this.cloudletsOrigin = $.cloudletsOrigin;
        this.contentDeliveryNetwork = $.contentDeliveryNetwork;
        this.contentType = $.contentType;
        this.deviceCharacteristic = $.deviceCharacteristic;
        this.ecmdAuthGroups = $.ecmdAuthGroups;
        this.ecmdAuthScheme = $.ecmdAuthScheme;
        this.ecmdIsAuthenticated = $.ecmdIsAuthenticated;
        this.ecmdUsername = $.ecmdUsername;
        this.edgeWorkersFailure = $.edgeWorkersFailure;
        this.fileExtension = $.fileExtension;
        this.filename = $.filename;
        this.hostname = $.hostname;
        this.matchAdvanced = $.matchAdvanced;
        this.matchCpCode = $.matchCpCode;
        this.matchResponseCode = $.matchResponseCode;
        this.matchVariable = $.matchVariable;
        this.metadataStage = $.metadataStage;
        this.originTimeout = $.originTimeout;
        this.path = $.path;
        this.queryStringParameter = $.queryStringParameter;
        this.random = $.random;
        this.recoveryConfig = $.recoveryConfig;
        this.regularExpression = $.regularExpression;
        this.requestCookie = $.requestCookie;
        this.requestHeader = $.requestHeader;
        this.requestMethod = $.requestMethod;
        this.requestProtocol = $.requestProtocol;
        this.requestType = $.requestType;
        this.responseHeader = $.responseHeader;
        this.serverLocation = $.serverLocation;
        this.time = $.time;
        this.tokenAuthorization = $.tokenAuthorization;
        this.userAgent = $.userAgent;
        this.userLocation = $.userLocation;
        this.userNetwork = $.userNetwork;
        this.variableError = $.variableError;
        this.virtualWaitingRoomRequest = $.virtualWaitingRoomRequest;
        this.visitorPrioritizationRequest = $.visitorPrioritizationRequest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530Criterion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530Criterion $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530Criterion();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530Criterion defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530Criterion(Objects.requireNonNull(defaults));
        }

        public Builder advancedImMatch(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionAdvancedImMatch advancedImMatch) {
            $.advancedImMatch = advancedImMatch;
            return this;
        }

        public Builder bucket(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionBucket bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder cacheability(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionCacheability cacheability) {
            $.cacheability = cacheability;
            return this;
        }

        public Builder chinaCdnRegion(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionChinaCdnRegion chinaCdnRegion) {
            $.chinaCdnRegion = chinaCdnRegion;
            return this;
        }

        public Builder clientCertificate(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate clientCertificate) {
            $.clientCertificate = clientCertificate;
            return this;
        }

        public Builder clientIp(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionClientIp clientIp) {
            $.clientIp = clientIp;
            return this;
        }

        public Builder clientIpVersion(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionClientIpVersion clientIpVersion) {
            $.clientIpVersion = clientIpVersion;
            return this;
        }

        public Builder cloudletsOrigin(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionCloudletsOrigin cloudletsOrigin) {
            $.cloudletsOrigin = cloudletsOrigin;
            return this;
        }

        public Builder contentDeliveryNetwork(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionContentDeliveryNetwork contentDeliveryNetwork) {
            $.contentDeliveryNetwork = contentDeliveryNetwork;
            return this;
        }

        public Builder contentType(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionContentType contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder deviceCharacteristic(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionDeviceCharacteristic deviceCharacteristic) {
            $.deviceCharacteristic = deviceCharacteristic;
            return this;
        }

        public Builder ecmdAuthGroups(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionEcmdAuthGroups ecmdAuthGroups) {
            $.ecmdAuthGroups = ecmdAuthGroups;
            return this;
        }

        public Builder ecmdAuthScheme(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionEcmdAuthScheme ecmdAuthScheme) {
            $.ecmdAuthScheme = ecmdAuthScheme;
            return this;
        }

        public Builder ecmdIsAuthenticated(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionEcmdIsAuthenticated ecmdIsAuthenticated) {
            $.ecmdIsAuthenticated = ecmdIsAuthenticated;
            return this;
        }

        public Builder ecmdUsername(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionEcmdUsername ecmdUsername) {
            $.ecmdUsername = ecmdUsername;
            return this;
        }

        public Builder edgeWorkersFailure(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionEdgeWorkersFailure edgeWorkersFailure) {
            $.edgeWorkersFailure = edgeWorkersFailure;
            return this;
        }

        public Builder fileExtension(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionFileExtension fileExtension) {
            $.fileExtension = fileExtension;
            return this;
        }

        public Builder filename(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionFilename filename) {
            $.filename = filename;
            return this;
        }

        public Builder hostname(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionHostname hostname) {
            $.hostname = hostname;
            return this;
        }

        public Builder matchAdvanced(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionMatchAdvanced matchAdvanced) {
            $.matchAdvanced = matchAdvanced;
            return this;
        }

        public Builder matchCpCode(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionMatchCpCode matchCpCode) {
            $.matchCpCode = matchCpCode;
            return this;
        }

        public Builder matchResponseCode(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionMatchResponseCode matchResponseCode) {
            $.matchResponseCode = matchResponseCode;
            return this;
        }

        public Builder matchVariable(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionMatchVariable matchVariable) {
            $.matchVariable = matchVariable;
            return this;
        }

        public Builder metadataStage(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionMetadataStage metadataStage) {
            $.metadataStage = metadataStage;
            return this;
        }

        public Builder originTimeout(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionOriginTimeout originTimeout) {
            $.originTimeout = originTimeout;
            return this;
        }

        public Builder path(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionPath path) {
            $.path = path;
            return this;
        }

        public Builder queryStringParameter(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionQueryStringParameter queryStringParameter) {
            $.queryStringParameter = queryStringParameter;
            return this;
        }

        public Builder random(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionRandom random) {
            $.random = random;
            return this;
        }

        public Builder recoveryConfig(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionRecoveryConfig recoveryConfig) {
            $.recoveryConfig = recoveryConfig;
            return this;
        }

        public Builder regularExpression(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionRegularExpression regularExpression) {
            $.regularExpression = regularExpression;
            return this;
        }

        public Builder requestCookie(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionRequestCookie requestCookie) {
            $.requestCookie = requestCookie;
            return this;
        }

        public Builder requestHeader(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader requestHeader) {
            $.requestHeader = requestHeader;
            return this;
        }

        public Builder requestMethod(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionRequestMethod requestMethod) {
            $.requestMethod = requestMethod;
            return this;
        }

        public Builder requestProtocol(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionRequestProtocol requestProtocol) {
            $.requestProtocol = requestProtocol;
            return this;
        }

        public Builder requestType(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionRequestType requestType) {
            $.requestType = requestType;
            return this;
        }

        public Builder responseHeader(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionResponseHeader responseHeader) {
            $.responseHeader = responseHeader;
            return this;
        }

        public Builder serverLocation(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionServerLocation serverLocation) {
            $.serverLocation = serverLocation;
            return this;
        }

        public Builder time(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionTime time) {
            $.time = time;
            return this;
        }

        public Builder tokenAuthorization(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization tokenAuthorization) {
            $.tokenAuthorization = tokenAuthorization;
            return this;
        }

        public Builder userAgent(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionUserAgent userAgent) {
            $.userAgent = userAgent;
            return this;
        }

        public Builder userLocation(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionUserLocation userLocation) {
            $.userLocation = userLocation;
            return this;
        }

        public Builder userNetwork(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionUserNetwork userNetwork) {
            $.userNetwork = userNetwork;
            return this;
        }

        public Builder variableError(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionVariableError variableError) {
            $.variableError = variableError;
            return this;
        }

        public Builder virtualWaitingRoomRequest(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionVirtualWaitingRoomRequest virtualWaitingRoomRequest) {
            $.virtualWaitingRoomRequest = virtualWaitingRoomRequest;
            return this;
        }

        public Builder visitorPrioritizationRequest(@Nullable GetPropertyRulesBuilderRulesV20230530CriterionVisitorPrioritizationRequest visitorPrioritizationRequest) {
            $.visitorPrioritizationRequest = visitorPrioritizationRequest;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530Criterion build() {
            return $;
        }
    }

}
